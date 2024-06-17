package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class NthNodeFromLast {
    Node head;
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    // 12 3 4 65 75 32 65 76 => 32
    public static int getNthValueFromLast (Node head, int n) {
        if (head == null) {
            System.out.println("The LinkedList given is empty");
            return -1;
        }
        Node fastNode = head, slowNode = head;
        // give head start of N values to the fast node
        int position = 1;
        while (fastNode.next != null && position < n) {
            fastNode = fastNode.next;
            position++;
        }
        while (fastNode.next != null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        return slowNode.data;
    }
    // 10 20 30 40 50
    public static Node removeNthNodeFromLast(Node head, int n) {
        if (head == null) {
            System.out.println("The LinkedList is Empty");
            return head;
        }
        Node fastNode = head, slowNode = head;
        int position = 0;
        while (position < n) {
            if (fastNode == null) {
                System.out.println("The index N is greater than the size of LinkedList");
                return head;
            }
            fastNode = fastNode.next;
            position++;
        }
        while (fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }
        System.out.println("Nth node from last = " + slowNode.next.data);
        slowNode.next = slowNode.next.next;
        return head;
    }
    public static void print(Node head) {
        while (head != null) {
            System.out.println("Data: " + head.data);
            head = head.next;
        }
    }
    public static void main (String[] args) {
        
        Node n1 = new Node(10);
        n1.next = new Node(20);
        n1.next.next = new Node(30);
        n1.next.next.next = new Node(40);
        n1.next.next.next.next = new Node(50);

        print(removeNthNodeFromLast(n1, 3));

    }
}
