/*
Burning Tree Problem (Fire Spread in Binary Tree)
Pattern: BFS + Parent Mapping
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BurningTree {

    // Step 1: Build parent mapping
    public static Map<Node, Node> buildParentMap(Node root) {
        Map<Node, Node> parentMap = new HashMap<>();

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr.left != null) {
                parentMap.put(curr.left, curr);
                q.add(curr.left);
            }

            if (curr.right != null) {
                parentMap.put(curr.right, curr);
                q.add(curr.right);
            }
        }

        return parentMap;
    }

    // Step 2: Find target node
    public static Node findNode(Node root, int target) {
        if (root == null) return null;

        if (root.val == target) return root;

        Node left = findNode(root.left, target);
        if (left != null) return left;

        return findNode(root.right, target);
    }

    // Step 3: Burn the tree using BFS
    public static int burnTree(Node root, int target) {

        Map<Node, Node> parentMap = buildParentMap(root);
        Node targetNode = findNode(root, target);

        Set<Node> visited = new HashSet<>();
        Queue<Node> q = new LinkedList<>();

        q.add(targetNode);
        visited.add(targetNode);

        int time = -1;

        while (!q.isEmpty()) {
            int size = q.size();
            time++;

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();

                // left
                if (curr.left != null && !visited.contains(curr.left)) {
                    visited.add(curr.left);
                    q.add(curr.left);
                }

                // right
                if (curr.right != null && !visited.contains(curr.right)) {
                    visited.add(curr.right);
                    q.add(curr.right);
                }

                // parent
                if (parentMap.containsKey(curr) && !visited.contains(parentMap.get(curr))) {
                    visited.add(parentMap.get(curr));
                    q.add(parentMap.get(curr));
                }
            }
        }

        return time;
    }

    public static void main(String[] args) {

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

        int target = 5;

        int result = burnTree(root, target);
        System.out.println("Time to burn tree: " + result);
    }
}
