package LinkedList;

public class LinkedList {
    private Node first;
    private  Node last;

    public <T extends  Comparable> void addFirst(T item){
        var node = new Node(item);
        // if the head/first is pointing at a node, the new node to point to the head
        if (first != null) {
            node.setNode(first);

        }
        // if the last is pointing at null, move it to point to the new node
        if(last == null){
            last = node;
        }
        // update the head to point to the new node
        first = node;
    }
    public <T extends  Comparable> void addLast(T item){
        var node = new Node(item);
        // if this is the first node to be added, point the head/first to the node
        if(first == null){
            first = node;
        }
        // if the tail is pointing at a node, update the reference to point to the new node
        if(last != null){
            last.setNode(node);
        }
        // move the tail/last to point to the new node
       last = node;
    }
    public void printItems(){
        if(first == null){
            System.out.println("Empty list");
        }
        while(first != null){
            System.out.print(first.getValue() +", ");
            first = first.getNode();
        }

    }
    public  void deleteFirst(){
        if(first != null){
            if(first.getNode() != null){
                var temp = first.getNode();
                first.setNode(null);
                first = temp;
            }else {
                first = null;
            }

        }
    }
    public <T extends  Comparable> boolean contains(T item){
       var temp = first;
        while (temp != null){
            if(temp.getValue().compareTo(item) == 0){
                return true;
            }
            temp = temp.getNode();
        }
        return false;
    }
    public <T extends  Comparable> int indexOf(T item){
        int index = -1;
        var temp = first;
        while (temp != null){
            if(temp.getValue().compareTo(item) == 0){
                return index == -1 ? 0 : ++index;
            }
            temp = temp.getNode();
            ++index;
        }
        return index;
    }
    public  void deleteLast(){
        if(first != null){
            var temp = first;
            Node tempLast = null;
            while (temp != null){
                if(temp.getNode() != null && temp.getNode().getNode() == null){
                    tempLast = temp;
                    break;
                }
                temp = temp.getNode();
            }
            if(tempLast != null){
                tempLast.setNode(null);
                last = tempLast;
            }

        }
    }
}
