package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class DeleteNodeWithOnlyPointerGiven {
    Node head;
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void print (Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.print("NULL\n");
    }
    public static void deleteNode(Node node) {
        Node temp = node.next;
        node.data = temp.data;
        node.next = temp.next;
        System.gc();
    }
    public static void main (String[] args) {

        Node head = new Node(1);
        head.next = new Node(12);
        head.next.next = new Node(1);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(1);

        System.out.println("Before Deleting");
        print(head);

        System.out.println("Deleting Node");
        deleteNode(head.next.next.next);

        System.out.println("After Deleting");
        print(head);
    }
}
