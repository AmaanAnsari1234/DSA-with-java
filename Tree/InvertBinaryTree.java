/*
LeetCode 226 - Invert Binary Tree
Pattern: Recursion (DFS)
Time Complexity: O(n)
Space Complexity: O(h)
*/

public class InvertBinaryTree {

    public static TreeNode invertTree(TreeNode root) {

        if (root == null) return null;

        // swap left and right
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // recurse on children
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void main(String[] args) {

        /*
              4
             / \
            2   7
           / \ / \
          1  3 6  9
        */

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        invertTree(root);

        // simple check (root children swapped)
        System.out.println(root.left.val + " " + root.right.val); // 7 2
    }
}

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
