/*
LeetCode 226 - Invert Binary Tree
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

public class InvertTree {

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        // swap left and right
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // recurse
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    // helper to print tree (inorder)
    public static void printInorder(TreeNode root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \
            4   5
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.print("Before Invert (Inorder): ");
        printInorder(root);

        invertTree(root);

        System.out.print("\nAfter Invert (Inorder): ");
        printInorder(root);
    }
}
