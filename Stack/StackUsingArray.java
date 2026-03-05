// Implement Stack using Arrays

import java.util.*;

class StackUsingArray {

    int[] stack;
    int top;
    int size;

    // Constructor
    StackUsingArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // Check if stack is empty
    boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    boolean isFull() {
        return top == size - 1;
    }

    // Push operation
    void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
        System.out.println(x + " pushed into stack");
    }

    // Pop operation
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Peek operation
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    // Main method
    public static void main(String[] args) {

        StackUsingArray stack = new StackUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        System.out.println(stack.pop() + " popped from stack");
        System.out.println(stack.pop() + " popped from stack");

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push(40);
        stack.push(50);
        stack.push(60);   // Overflow case

        System.out.println("Top element: " + stack.peek());
    }
}

