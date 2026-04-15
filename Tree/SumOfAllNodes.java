/*
Sum of All Nodes in a Binary Tree
Pattern: Recursion (DFS)
Time Complexity: O(n)
Space Complexity: O(h)
*/


class Node{
    int val;
    Node left, right;

    Node(int val){
        this.val=val;
        this.left = null;
        this.right = null;
    }
}

public class P20 {
    public static int sum(Node root){
        if (root== null) {
            return 0;
        }
        int left= sum(root.left);
        int right = sum(root.right);

        return left + right + root.val;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left =  new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int result = sum(root);
        System.out.println("Sum of All Nodes = " + result);
    }
}
