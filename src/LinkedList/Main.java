package LinkedList;

public class Main {
    public  static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addLast(80);
        list.addFirst(40);
        list.addFirst(200);
        list.addFirst(12);
        list.addFirst(15);
        list.addLast(2);
        list.addLast(10);
        list.addFirst(20);
        list.addFirst(100);
        list.addLast(900);
        System.out.println("Contains 900: "+ list.contains(900));
        System.out.println("Index of 900: "+ list.indexOf(900));
        System.out.println("Index of 100: "+ list.indexOf(100));
        System.out.println("Index of 20: "+ list.indexOf(20));
//        list.deleteFirst();
//        list.deleteFirst();
        list.printItems();
    }
}
