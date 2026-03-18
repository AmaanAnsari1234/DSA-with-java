// Implement Queue using Array

class Queue {

    int[] arr;
    int front, rear, size;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    // Enqueue (insert)
    void enqueue(int x) {
        if (rear == size-1)
        {
            System.out.println("Queue is Full");
            return;
        }
        arr[++rear]=x;
    }

    // Dequeue (remove)
    int dequeue() {
        if (front>rear)
        {
            System.out.println("Queue Overflow");
            return -1;
        }
        return arr[front++];
    }

    // Peek front element
    int peek() {
        if (front>rear)
        {
            System.out.println("Que");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.peek());    // 20

        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.dequeue()); // 20
        System.out.println(q.dequeue()); // 30
        System.out.println(q.dequeue()); // 40
        System.out.println(q.dequeue()); // 50

        q.enqueue(60); // Overflow

        System.out.println(q.dequeue()); //
    }
}


