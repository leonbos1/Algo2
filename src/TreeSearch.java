public class TreeSearch {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(25);
        tree.insert(75);
        tree.insert(12);
        tree.insert(37);
        tree.insert(43);
        tree.insert(30);
        tree.insert(33);
        tree.insert(87);
        tree.insert(93);
        tree.insert(97);

        System.out.println("Tree structure:");
        tree.display(tree.root);
    }


}

class Tree {

    public Node root;

    public Tree() {
        root = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void display(Node root) {
        if (root != null) {
            display(root.leftChild);
            System.out.print(" " + root.data);
            display(root.rightChild);
        }
    }

    public Node find(int key) {
        Node current = root;
        while (current.data != key) {
            if (key < current.data) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }
}

class Node {
    public Node parent;
    public Node leftChild;
    public Node rightChild;
    public int data;

    public Node(int value) {
        this.data = value;
    }
}