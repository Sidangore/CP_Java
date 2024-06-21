package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class MergeTwoSortedLinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    static void print (Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }
    static Node mergeSortedList (Node a, Node b) {
        if (a == null) return b;
        else if (b == null) return a;
        Node head = null, tail = null;
        if (a.data <= b.data) {
            head = tail = a;
            a = a.next;
        } else {
            head = tail = b;
            b = b.next;
        }
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                tail = a;
                a = a.next;
            } else {
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }
        if (a == null) {
            tail.next = b;
        }
        if (b == null) {
            tail.next = a;
        }
        return head;
    }
    public static void main (String[] args) {
        Node a = new Node(10);
        a.next = new Node(20);
        a.next.next = new Node(30);
        Node b = new Node(5);
        b.next = new Node(35);
        System.out.println("Orginal Lists: ");
        print(a);
        print(b);
        System.out.println("Sorted List: ");
        print(mergeSortedList(a, b));
    }
}
