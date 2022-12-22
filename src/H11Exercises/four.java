package H11Exercises;

public class four {

    Node root;

    public static void main(String[] args) {
        four tree = new four();

        tree.insert(5);
        tree.insert(10);
        tree.insert(1);
        tree.insert(6);
        tree.insert(3);
        tree.insert(13);
        tree.insert(8);

        tree.printTree(tree.root);
    }

    public void insert(int value) {
        if (this.root == null) {
            this.root = new Node(value);
            return;
        }

        Node current = root;

        while (true) {
            if (current.left == null) {
                if (value < current.value) {
                    current.left = new Node(value);
                    break;
                }
            }

            if (current.right == null) {
                if (value >= current.value) {
                    current.right = new Node(value);
                    break;
                }
            }

            if (value < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

    }

    public void printTree(Node node) {
        if (node==null) {
            return;
        }

        System.out.print(node.value + " ");
        printTree(node.left);
        printTree(node.right);
    }


}

class Node {

    Node left;
    Node right;
    int value;

    public Node(int v) {
        this.value = v;
    }

    public boolean isExternal() {
        return (this.left == null && this.right == null);
    }

}
