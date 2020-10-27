package LinkedList;

public class Main {
    public  static void main(String[] args){
        LinkedList list = new LinkedList();
//        list.addLast(80);
        list.addFirst(40);
        list.addFirst(200);
        list.addFirst(12);
        list.addFirst(15);

//        list.deleteFirst();
//        list.deleteFirst();
//        list.reverseOnDoubleLinkedList();
        list.revereOnSingleLinkedList();
        System.out.println("done printing");
        list.printItems();


    }
}
