/*
LeetCode 112 - Path Sum
Pattern: Recursion (DFS)
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

public class PathSum {

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        // if leaf node
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        int remaining = targetSum - root.val;

        return hasPathSum(root.left, remaining) ||
               hasPathSum(root.right, remaining);
    }

    public static void main(String[] args) {

        /*
                5
               / \
              4   8
             /   / \
            11  13  4
           /  \        \
          7    2        1
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        boolean result = hasPathSum(root, targetSum);
        System.out.println("Path exists: " + result);
    }
}
