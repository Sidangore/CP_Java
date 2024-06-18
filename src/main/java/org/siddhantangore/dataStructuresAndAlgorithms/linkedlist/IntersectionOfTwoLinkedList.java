package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoLinkedList {
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
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }
    public static void getIntersectionNode(Node head1, Node head2) {
        Map<Node, Integer> map = new HashMap<>();
        while (head1 != null) {
            map.put(head1, 0);
            head1 = head1.next;
        }
        while (head2 != null) {
            if (map.containsKey(head2)) {
                System.out.println("Intersection Node = " + head2.data);
                return;
            }
            head2 = head2.next;
        }
        System.out.println("No Intersection Node");
    }
    public static void main (String[] args) {
        Node head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(15);
        head1.next.next.next.next = new Node(30);
        print(head1);

        Node head2 = new Node(10);
        head2.next = head1.next.next.next;
        head2.next.next = new Node(30);
        print(head2);

        getIntersectionNode(head1, head2);

    }
}
