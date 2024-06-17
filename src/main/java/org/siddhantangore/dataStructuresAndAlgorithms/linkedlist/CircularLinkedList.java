package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class CircularLinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node previous;
        Node (int data) {
            this.data = data;
            next = null;
            previous = null;
        }

    }
    public static Node insertAtFront(Node head, int data) {
        if (head == null) {
            head = new Node(data);
            return head;
        }
        Node newNode = new Node(data);
        newNode.next = head.next;
        head.next.previous = newNode;
        newNode.previous = head;
        head.next = newNode;
        int tempData = head.data;
        head.data = data;
        newNode.data = tempData;
        return head;
    }
    public static Node insertAtFront2(Node head, int data) {
        Node newNode = new Node(data);
        Node last = head.previous;
        newNode.next = head;
        last.next = head.previous = newNode;
        return newNode;
    }
    public static void print(Node head) {
        if (head != null) {
            Node currentNode = head;
            do {
                System.out.println("Data: " + currentNode.data);
                currentNode = currentNode.next;
            } while(currentNode != head);
        }
    }
    public static void main (String[] args) {
        Node n1 = new Node(10);
        n1.next = new Node(20);
        n1.next.previous = n1;
        n1.next.next = new Node(30);
        n1.next.next.previous = n1.next;
        n1.next.next.next = new Node(40);
        n1.next.next.next.previous = n1.next.next;
        n1.next.next.next.next = new Node(50);
        n1.next.next.next.next.next = n1;
        n1.next.next.next.next.previous = n1.next.next.next;
        n1.previous = n1.next.next.next.next;

        print(n1);

        System.out.println("insert at front 60");

        print(insertAtFront2(n1, 60));
    }
}
