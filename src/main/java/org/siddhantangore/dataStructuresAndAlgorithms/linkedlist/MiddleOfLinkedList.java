package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class MiddleOfLinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            next = null;
        }

    }
    public static void insertAtFront(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head.next;
        head = newNode;
    }

    public static void push(Node head, int data) {
        if (head == null && head.data > data) {
            insertAtFront(head, data);
        } else {
            Node newNode = new Node(data);
            while (head.next != null && head.next.data < data) {
                head = head.next;
            }
            newNode.next = head.next;
            head.next = newNode;
        }
    }

    public static void getMiddleNode(Node head) {
        Node fastNode = head;
        Node slowNode = head;
        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        System.out.println("Middle node = " + slowNode.data);
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.println("Data: " + head.data);
            head = head.next;
        }
    }
    public static void main (String[] args) {
        Node n1 = new Node(2);
        n1.next = new Node(5);
        n1.next.next = new Node(7);
        n1.next.next.next = new Node(10);
        n1.next.next.next.next = new Node(15);

        push(n1, 9);
        push(n1, 11);
        push(n1,8);
        print(n1);

        getMiddleNode(n1);

    }
}
