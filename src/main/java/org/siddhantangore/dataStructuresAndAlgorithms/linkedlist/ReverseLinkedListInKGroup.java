package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class ReverseLinkedListInKGroup {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.print("NULL\n");
    }
    static Node reverseLinkedListInKGroup(Node head, int k) {
        // 3 2 1 6 5 4 8 7
        if (head == null || head.next == null) {
            System.out.println("The LinkedList is Empty");
            return head;
        }
        Node previous = head, current = head, next = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        System.out.println("Size = " + size);
        while (next != null) {
            for (int i = 1; i < k; i++) {
                previous = current;
                current = current.next;
                next = current.next;
            }
            current.next = previous;
        }

        return head;

    }
    public static void main (String[] args) {
        Node head = new Node(1);
        Node currentNode = head;
        for (int i = 2; i <= 8; i++) {
            Node newNode = new Node(i);
            currentNode.next = newNode;
            currentNode = currentNode.next;
        }
        print(head);
        print(reverseLinkedListInKGroup(head, 3));
    }
}
