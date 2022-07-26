package Tree;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public void insert(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else leftChild.insert(value);
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else rightChild.insert(value);
        }
    }

    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.print("Data = " + data + ", ");

        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public TreeNode get(int value) {
        if (value == data) {
            return this;
        }
        if (value < data) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        return null;
    }

    public TreeNode(int data) {
        this.data = data;
    }
}
