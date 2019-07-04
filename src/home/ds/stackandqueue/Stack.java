package home.ds.stackandqueue;

public class Stack {
    private Node top;

    public Integer pop() {
        Integer data = null;
        if (top != null) {
            data = top.getData();
            top = top.getNext();
        }
        return data;
    }

    public void push(Integer data) {
        Node newTop = new Node(data);
        newTop.setNext(top);
        top = newTop;
    }

    public Integer peek(){
        if (top !=null)
            return top.getData();
        return null;
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(12);
        stack.push(13);
        stack.push(10);
        stack.push(1);
        stack.push(2);
        stack.push(22);
        stack.push(7);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
