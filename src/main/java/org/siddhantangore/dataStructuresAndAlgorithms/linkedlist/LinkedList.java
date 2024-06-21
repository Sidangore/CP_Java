package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }
    void print() {
        if (this.head == null) {
            System.out.println("The linkedlist is empty");
            return;
        }
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }
    static void printRecursively(Node head) {
        if (head == null) {
            System.out.print("NULL\n");
            return;
        }
        System.out.print(head.data + " -> ");
        print(head.next);
    }
    void printRecursively() {
        if (this.head == null) {
            System.out.print("NULL\n");
            return;
        }
        System.out.print(this.head.data + " -> ");
        print(this.head.next);
    }
    void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        newNode.next = this.head;
        this.head = newNode;
    }
    static Node insertAtStart(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    void insertAtEnd(int data) {
        if (this.head == null) {
            insertAtStart(data);
            return;
        }
        Node currentNode = this.head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(data);
    }
    static Node insertAtEnd(Node head, int data) {
        if (head == null) {
            head = insertAtStart(null, data);
            return head;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(data);
        return head;
    }
    Node insertAtPosition(Node head, int position, int data) {
        if (head == null || position < 1) {
            System.out.println("Invalid operation");
            return head;
        }
        if (position == 1) {
            head = insertAtStart(head, data);
            return head;
        }
        Node newNode = new Node(data);
        Node currentNode = head;
        for (int i = 0; i < position - 1 && currentNode != null; i++) {
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            System.out.println("Index out of bound, invalid insertion");
            return head;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        return head;
    }
    void insertAtPosition(int position, int data) {
        if (this.head == null || position < 1) {
            System.out.println("Invalid insertion");
            return;
        }
        if (position == 1) {
            insertAtStart(data);
            return;
        }
        Node currentNode = this.head;
        int currentPosition = 1;
        while (currentNode != null && currentPosition < position - 1) {
            currentPosition++;
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            System.out.println("Invalid insertion");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }
    void deleteAtStart() {
        if (this.head == null) {
            System.out.println("LinkedList is empty, invalid deletion");
            return;
        }
        if (this.head.next == null) {
            this.head = null;
        } else {
            this.head = this.head.next;
        }
    }
    static Node deleteAtStart(Node head) {
        if (head == null) {
            return null;
        } else {
            return head.next;
        }
    }
    void deleteAtEnd() {
        if (this.head == null) {
            System.out.println("LinkedList is empty, invalid deletion");
            return;
        }
        if (this.head.next == null) {
            deleteAtStart();
            return;
        }
        Node currentNode = this.head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
    }
    static Node deleteAtEnd(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            head = deleteAtStart(head);
            return head;
        }
        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        return head;
    }
    int firstIndexOf(int data) {
        if (isEmpty()) {
            System.out.print("LinkedList is empty");
            return -1;
        }
        Node currentNode = this.head;
        int position = 1;
        while (currentNode != null) {
            if (currentNode.data == data) {
                return position;
            }
            position++;
            currentNode = currentNode.next;
        }
        return -1;
    }
    static int firstIndexOf(Node head, int data) {
        if (isEmpty(head)) {
            return -1;
        }
        Node currentNode = head;
        int position = 1;
        while (currentNode != null) {
            if (currentNode.data == data) {
                return position;
            }
            position++;
            currentNode = currentNode.next;
        }
        return -1;
    }
    boolean isEmpty() {
        return this.head == null;
    }
    static boolean isEmpty(Node head) {
        return head == null;
    }
    static int firstIndexOfRecursively(Node head, int data) {
        if(isEmpty(head)) {
            return -1;
        }
        if (head.data == data) {
            return 1;
        } else {
            int result = firstIndexOfRecursively(head.next, data);
            if (result == -1) return -1;
            else return result + 1;
        }
    }
    public static void main (String[] args) {
        /*Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        print(head);
        printRecursively(head);
        head = insertAtStart(head, 50);
        print(head);
        head = insertAtEnd(head, 70);
        print(head);

        LinkedList list = new LinkedList();
        list.insertAtStart(10);
        list.insertAtStart(10);
        list.insertAtStart(10);
        list.print();
        list.printRecursively();
        list.insertAtEnd(60);
        list.print();*/

        LinkedList list2 = new LinkedList();
        list2.insertAtEnd(10);
        list2.insertAtStart(20);
        list2.insertAtPosition(1, 30);
        list2.insertAtPosition(3, 40);
        list2.insertAtPosition(6, 70);
        list2.insertAtPosition(0, 50);
        list2.print();
    }
}
