/*
LeetCode 98 - Validate Binary Search Tree
Pattern: Recursion (DFS with Range)
Time Complexity: O(n)
Space Complexity: O(h)
*/

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class P22 {

    public static boolean isSame(Node p, Node q) {

        // both null
        if (p == null && q ==null) return true;

        // one null
        if (p == null || q== null) return false;

        // values different
        if (p.val != q.val) return false;
         
        // check left and right 
        return isSame(p.left, q.left) && isSame(p.right, q.right);
    }

    public static void main(String[] args) {

        /*
            Tree 1:
                1
               / \
              2   3

            Tree 2:
                1
               / \
              2   3
        */

        Node t1 = new Node(1);
        t1.left = new Node(2);
        t1.right = new Node(3);

        Node t2 = new Node(1);
        t2.left = new Node(2);
        t2.right = new Node(3);

        boolean result = isSame(t1, t2);
        System.out.println("Are trees identical ? " + result);
    }
}
