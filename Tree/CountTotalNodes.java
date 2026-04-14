/*
Count Total Nodes in a Binary Tree
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

public class P19 {
    public static int count(Node root){
        if (root== null) {
            return 0;
        }
        int left= count(root.left);
        int right = count(root.right);

        return left + right + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left =  new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int result = count(root);
        System.out.println("Total Nodes: " + result);
    }
}
