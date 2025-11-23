public class Queue {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}

class ArrayQueue {
    private int[] arr;
    private int front, rear, size, capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int result = arr[front];
        front = (front + 1) % capacity;
        size--;
        return result;
    }

    public int peek() {
        if (isEmpty()) return -1;
        return arr[front];
    }
}
