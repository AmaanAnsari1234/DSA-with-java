/*
Custom Problem - Longest Lucky Path (Even Nodes)
Pattern: Recursion (DFS on Tree)
Time Complexity: O(n)
Space Complexity: O(h)
*/
// longest lucky part
class Node{
    int val;
    Node left,right;

    Node(int val){
        this.val=val;
        left=right=null;
    }
}


public class P17 {
    
    public static int longestLuckyPath(Node root) {
        if (root==null)  return 0;
        
        if (root.val % 2 !=0 ) return 0;

        int left =longestLuckyPath(root.left);
        int right = longestLuckyPath(root.right);
        
        return 1 + Math.max(left, right);
    }


    public static void main(String[] args)
    {
        Node root = new Node(2);
        root.left = new Node(4);
        root.right = new Node(3);
        root.left = new    Node(6);
        root.right = new   Node(5);

        System.out.println(longestLuckyPath(root));
    }
}   
