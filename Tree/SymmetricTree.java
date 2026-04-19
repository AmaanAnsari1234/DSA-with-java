/*
LeetCode 101 - Symmetric Tree
Pattern: Recursion (Mirror Check)
Time Complexity: O(n)
Space Complexity: O(h)
*/

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root) {
        return mirror(root.left, root.right);
    }

    public static boolean mirror(TreeNode a, TreeNode b) {

        if (a == null && b == null) return true;

        if (a == null || b == null) return false;

        if (a.val != b.val) return false;

        return mirror(a.left, b.right) &&
               mirror(a.right, b.left);
    }

    public static void main(String[] args) {

        /*
                1
               / \
              2   2
             / \ / \
            3  4 4  3
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        boolean result = isSymmetric(root);
        System.out.println("Is Symmetric: " + result);
    }
}
