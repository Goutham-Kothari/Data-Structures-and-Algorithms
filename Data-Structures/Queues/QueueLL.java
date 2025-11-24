public class QueueLL {
    
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue class
    static class Queue {
        Node front = null;   // head
        Node rear = null;    // tail

        // Add element (enqueue)
        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        // Remove element (dequeue)
        public int dequeue() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            int val = front.data;
            front = front.next;

            // if queue becomes empty
            if (front == null) {
                rear = null;
            }
            return val;
        }

        // Peek front element
        public int peek() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }

        // Check empty
        public boolean isEmpty() {
            return front == null;
        }

        // Print queue
        public void print() {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Main
    public static void main(String[] args) {
        Queue q = new Queue();
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.print();  // 10 20 30

        System.out.println(q.peek());  // 10

        q.dequeue();  
        q.print();  // 20 30

        q.dequeue();  
        q.dequeue();  
        q.dequeue();  // Queue empty
    }
}
