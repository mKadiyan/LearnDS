package home.ds.tree;

public class BTNodeProcessor {
    public static void main(String[] args) {
        BTNode node4 = new BTNode(4);
        BTNode node5 = new BTNode(5);
        BTNode node6 = new BTNode(6);
        BTNode node7 = new BTNode(7);
        BTNode node3 = new BTNode(3, node6, node7);
        BTNode node2 = new BTNode(2, node4, node5);
        BTNode root = new BTNode(1, node2, node3);

        root.postOrderTraversal();
    }
}
