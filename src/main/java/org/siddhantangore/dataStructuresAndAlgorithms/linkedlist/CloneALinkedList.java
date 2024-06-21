package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class CloneALinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node random;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.random = null;
        }
    }
    public static void print (Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }
    public static Node clone (Node head) {
        Node currentNode = head;
        while (currentNode != null) {
            Node newNode = new Node(currentNode.data);
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            currentNode = currentNode.next.next;
        }
        currentNode = head;
        while (currentNode != null) {
            currentNode.next.random = currentNode.random.next;
            currentNode = currentNode.next.next;
        }
        currentNode = head;
        Node clonedHead = head.next;
        Node temp = clonedHead;
        while (currentNode != null) {
            currentNode.next = currentNode.next.next;
            temp.next = (temp.next != null) ? temp.next.next : temp.next;
            currentNode = currentNode.next;
            temp = temp.next;
        }
        return clonedHead;
    }
    public static void main (String[] args) {
        Node start = new Node(1);
        start.next = new Node(2);
        start.next.next = new Node(3);
        start.next.next.next = new Node(4);
        start.next.next.next.next = new Node(5);

        // 1's random points to 3
        start.random = start.next.next;

        // 2's random points to 1
        start.next.random = start;

        // 3's and 4's random points to 5
        start.next.next.random = start.next.next.next.next;
        start.next.next.next.random
                = start.next.next.next.next;

        // 5's random points to 2
        start.next.next.next.next.random = start.next;

        System.out.println("Original list : ");
        print(start);

        Node clonedHead = clone(start);

        System.out.println("Cloned list : ");
        print(clonedHead);
    }
}
