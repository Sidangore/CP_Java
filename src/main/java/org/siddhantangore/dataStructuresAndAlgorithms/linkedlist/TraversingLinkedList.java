package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class TraversingLinkedList {
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
    public static void main (String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        print(head);
    }
}

