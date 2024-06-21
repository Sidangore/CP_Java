package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class RecursiveTraversingLinkedList {
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    static void print(Node head) {
        if (head == null) {
            System.out.print("NULL\n");
            return;
        }
        System.out.print(head.data + " -> ");
        print(head.next);
    }
    public static void main (String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        print(head);
    }
}
