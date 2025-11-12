public class SLinkedList {
    public static void main(String[] args) {
        SLL obj = new SLL();

        // Test insertions
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.dis(); // 10 -> 20 -> 30 -> null

        // Insert at specific positions
        obj.insertAtPosition(5, 1);   // beginning
        obj.insertAtPosition(15, 3);  // middle
        obj.insertAtPosition(40, 6);  // end
        obj.insertAtPosition(50, 10); // invalid
        obj.dis(); // 5 -> 10 -> 15 -> 20 -> 30 -> 40 -> null

        // Test delete
        obj.delete(5);   // delete head
        obj.delete(30);  // delete middle
        obj.delete(40);  // delete tail
        obj.delete(100); // not found
        obj.dis();       // 10 -> 15 -> 20 -> null

        // Test search
        obj.search(15);  // Yes
        obj.search(99);  // No
    }
}

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Singly Linked List
class SLL {
    Node head;
    Node tail;

    // Insert at end (O(1) using tail)
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Insert at a specific position (1-based index)
    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        // Case 1: invalid position
        if (position <= 0) {
            System.out.println("Invalid position: " + position);
            return;
        }

        // Case 2: insert at beginning
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            if (tail == null) tail = newNode; // list was empty
            return;
        }

        // Traverse to (position-1)th node
        Node temp = head;
        int count = 1;
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        // Case 3: position beyond length
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        // Case 4: insert in middle or at end
        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) tail = newNode; // update tail if at end
    }

    // Delete by value (safe for all cases)
    void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Case 1: delete head
        if (head.data == data) {
            System.out.println("Deleted: " + head.data);
            head = head.next;
            if (head == null) tail = null;
            return;
        }

        // Case 2: delete other nodes
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        // Case 3: value not found
        if (temp.next == null) {
            System.out.println("Value " + data + " not found");
            return;
        }

        // Case 4: found node
        System.out.println("Deleted: " + temp.next.data);
        if (temp.next == tail) tail = temp; // update tail if last node deleted
        temp.next = temp.next.next;
    }

    // Search for a value
    void search(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Yes");
                return;
            }
            temp = temp.next;
        }
        System.out.println("No");
    }

    // Display the list
    void dis() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
