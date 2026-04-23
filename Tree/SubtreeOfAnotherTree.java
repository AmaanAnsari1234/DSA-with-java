/*
LeetCode 572 - Subtree of Another Tree
Pattern: Recursion (DFS + Tree Comparison)
Time Complexity: O(n * m)
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

public class SubtreeCheck {

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;

        if (isSame(root, subRoot)) return true;

        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

    public static boolean isSame(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;

        if (a == null || b == null) return false;

        if (a.val != b.val) return false;

        return isSame(a.left, b.left) &&
               isSame(a.right, b.right);
    }

    public static void main(String[] args) {

        /*
                root:
                    3
                   / \
                  4   5
                 / \
                1   2

                subRoot:
                  4
                 / \
                1   2
        */

        // main tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        // subtree
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        boolean result = isSubtree(root, subRoot);
        System.out.println("Is Subtree: " + result);
    }
}
