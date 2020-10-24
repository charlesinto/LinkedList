package LinkedList;

public class Node<T extends  Comparable> {
    private T value;
    private Node node;

    public Node(T value) {
        this.value = value;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public T getValue() {
        return value;
    }
}
