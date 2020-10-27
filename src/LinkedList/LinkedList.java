package LinkedList;

public class LinkedList {
    private Node head;
    private  Node tail;
    private boolean reversed = false;
    public <T extends  Comparable> void addFirst(T item){
        var node = new Node(item);
        // if the head/first is pointing at a node, the new node to point to the head
        if (head != null) {
            node.setNextNode(head);
            head.setPrevious(node);
        }
        // if the last is pointing at null, move it to point to the new node
        if(tail == null){

            tail = node;
        }

        // update the head to point to the new node
        head = node;
    }
    public <T extends  Comparable> void addLast(T item){
        var node = new Node(item);
        // if this is the first node to be added, point the head/first to the node
        if(head == null){
            head = node;
        }
        // if the tail is pointing at a node, update the reference to point to the new node
        if(tail != null){
            tail.setNextNode(node);
            node.setPrevious(tail);
        }
        // move the tail/last to point to the new node
       tail = node;
    }
    public  void revereOnSingleLinkedList(){
        var previous = head;
        var current = head.getNextNode();
        while(current != null){
            var next = current.getNextNode();

            current.setNextNode(previous);
            previous = current;
            current = next;
        }
        tail = head;
        tail.setNextNode(null);
        head = previous;
    }
    public void reverseOnDoubleLinkedList(){
        var temp = tail;
        tail = head;
        head = temp;
        reversed = true;
    }
    public void printItems(){
        if(head == null){
            System.out.println("Empty list");
        }
        while(head!= null){
            System.out.print(head.getValue() +", ");
            head = reversed ? head.getPrevious() : head.getNextNode();

        }

    }
    public  void deleteFirst(){
        if(head != null){
            if(head.getNextNode() != null){
                var temp = head.getNextNode();
                head.setNextNode(null);
                head = temp;
            }else {
                head = null;
            }

        }
    }
    public <T extends  Comparable> boolean contains(T item){
       var temp = head;
        while (temp != null){
            if(temp.getValue().compareTo(item) == 0){
                return true;
            }
            temp = temp.getNextNode();
        }
        return false;
    }
    public <T extends  Comparable> int indexOf(T item){
        int index = -1;
        var temp = head;
        while (temp != null){
            if(temp.getValue().compareTo(item) == 0){
                return index == -1 ? 0 : ++index;
            }
            temp = temp.getNextNode();
            ++index;
        }
        return index;
    }
    public  void deleteLast(){
        if(head != null){
            var temp = head;
            Node tempLast = null;
            while (temp != null){
                if(temp.getNextNode() != null && temp.getNextNode().getNextNode() == null){
                    tempLast = temp;
                    break;
                }
                temp = temp.getNextNode();
            }
            if(tempLast != null){
                tempLast.setNextNode(null);
                tail = tempLast;
            }

        }
    }
}
