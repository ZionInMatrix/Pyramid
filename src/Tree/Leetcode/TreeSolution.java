package Tree.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class TreeSolution {
    public static void main(String[] args) {


    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null) {
            return (p.val == q.val
                    && isSameTree(p.left, q.left)
                    && isSameTree(p.right, q.right));
        }
        return false;
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode left;
        TreeNode right;

        left = invertTree(root.left);
        right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        result.add(root.val);
        if (root.left != null) {
            result.addAll(preorderTraversal(root.left));
        }
        if (root.right != null) {
            result.addAll(preorderTraversal(root.right));
        }

        return result;

    }
}