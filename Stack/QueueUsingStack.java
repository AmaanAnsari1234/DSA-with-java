// Implement Queue using Stack
import java.util.LinkedList;
import java.util.Queue;

    public class P27 {

        Queue<Integer> q1;
        Queue<Integer> q2;

        // Constructor
        public P27() {             // My Stack
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }

        // Push element x onto stack
        public void push(int x) {
            q1.add(x);
        }

        // Removes the element on top of the stack and returns it
        public int pop() {
            // Move all elements except last to q2
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }

            // Last element is the stack top
            int popped = q1.remove();

            // Swap q1 and q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return popped;
        }

        // Returns the element on top of the stack
        public int top() {
            // Move all elements except last to q2
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }

            int top = q1.remove();
            q2.add(top); // put it back

            // Swap q1 and q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }

        // Returns true if stack is empty
        public boolean empty() {
            return q1.isEmpty();
        }

        // -------- MAIN METHOD --------
        public static void main(String[] args) {
            P27 stack = new P27();     // P27

            stack.push(1);
            stack.push(2);

            System.out.println(stack.top());    // Expected: 2
            System.out.println(stack.pop());    // Expected: 2
            System.out.println(stack.empty());  // Expected: false
        }
    }


