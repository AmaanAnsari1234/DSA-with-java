/*
Custom Problem - Minimum Time to Spread Signal in Binary Tree
Pattern: BFS (Level Order Traversal)
Time Complexity: O(n)
Space Complexity: O(n)  

note: time starts from 0, therefore answer is 2 not 3
curr = current, poll means-> remove + give me front element from the queue
*/

import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class P18 {

    public static int minTime(Node root) {
        if (root == null) return 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int time = -1;

        while (!q.isEmpty()) {
            int size = q.size();
            time++;

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }

        return time;
    }

    public static void main(String[] args) {

        // Constructing the tree
        /*
                1
               / \
              2   3
             / \
            4   5
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int result = minTime(root);
        System.out.println("Minimum time to spread signal: " + result);
    }
}
