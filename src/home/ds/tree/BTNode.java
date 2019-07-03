package home.ds.tree;

public class BTNode {
    private int data;
    private BTNode left;
    private BTNode right;

    public BTNode(int data) {
        this.data = data;
    }

    public BTNode(int data, BTNode left, BTNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public BTNode getLeft() {
        return left;
    }



    public BTNode getRight() {
        return right;
    }


    public void preOrderTraversal() {
        preOrder(this);
    }

    private void preOrder(BTNode btNode){
        if(btNode == null)
            return;
        System.out.println(btNode.data);
        preOrder(btNode.left);
        preOrder(btNode.right);
    }

    public void inOrderTraversal() {
        inOrder(this);
    }

    private void inOrder(BTNode btNode){
        if(btNode == null)
            return;
        inOrder(btNode.left);
        System.out.println(btNode.data);
        inOrder(btNode.right);
    }

    public void postOrderTraversal() {
        postOrder(this);
    }

    private void postOrder(BTNode btNode){
        if(btNode == null)
            return;
        postOrder(btNode.left);
        postOrder(btNode.right);
        System.out.println(btNode.data);
    }
}
