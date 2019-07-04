package home.ds.stackandqueue;

public class Queue {
    private Node first, last;

    void enqueue(Integer data) {
        if (first == null) {
            last = new Node(data);
            first = last;
        } else {
            Node node = new Node(data);
            last.setNext(node);
            last = last.getNext();
        }
    }

    public Integer dequeue() {
        Integer data = null;
        if (first != null) {
            data = first.getData();
            first = first.getNext();
        }
        return data;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(22);
        queue.enqueue(7);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
