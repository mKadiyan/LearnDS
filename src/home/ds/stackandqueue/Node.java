package home.ds.stackandqueue;

public class Node {
    private Integer data;
    private Node next;

    public Node(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public Integer getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
