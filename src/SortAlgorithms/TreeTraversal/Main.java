package SortAlgorithms.TreeTraversal;


public class Main {

    public static void main(String[] args) {
        Node data = createData();
        inOrderTraversal(data);
    }

    public static void preorderTraversal(Node n) {
        if (n == null) {
            return;
        }
        System.out.println(n.value + "");
        preorderTraversal(n.left);
        preorderTraversal(n.right);

    }

    public static void postOrderTraversal(Node n) {
        if (n == null) {
            return;
        }
        postOrderTraversal(n.left);
        postOrderTraversal(n.right);
        System.out.println(n.value + "");

    }

    public static void inOrderTraversal(Node n) {
        if (n == null) {
            return;
        }
        inOrderTraversal(n.left);
        System.out.println(n.value + "");
        inOrderTraversal(n.right);

    }

    public static Node createData() {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");

        a.left = b;
        a.right = g;
        b.left = c;
        b.right = d;
        c.left = e;
        e.right = f;
        return a;
    }
}
