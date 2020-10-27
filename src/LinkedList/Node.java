package LinkedList;

public class Node<T extends  Comparable> {
    private T value;
    private Node next;
    private  Node previous;

    public Node(T value) {
        this.value = value;
    }

    public Node getNextNode() {
        return next;
    }

    public void setNextNode(Node node) {
        this.next = node;
    }

    public T getValue() {
        return value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
