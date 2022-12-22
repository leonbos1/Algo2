public class BinaryTree {

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    public Node insert(Node root, int data) {

        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }



    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        printTree(tree.root);

    }

    public static void printTree(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);

        printTree(root.left);
        printTree(root.right);
    }




}


class Node {

    public int data;

    public Node left;

    public Node right;

    public Node(int data) {

        this.data = data;
        left = null;
        right = null;
    }

    public boolean isExternal() {
        return this.left == null && this.right == null;
    }
}
