package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

import java.util.Map;
import java.util.HashMap;
public class IntersectionOfLinkedLists {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void getIntersectionNode(Node head1, Node head2) {
        Map<Node, Integer> map = new HashMap<>();
        while (head1 != null) {
            map.put(head1, 0);
            head1 = head1.next;
        }
        while (head2 != null) {
            if (map.containsKey(head2)) {
                System.out.println("Merged at " + head2.data);
                return;
            }
            head2 = head2.next;
        }
        System.out.println("No merging of the lists");
    }
    public static void main (String[] args) {
        // Initialise list 1
        Node n1 = new Node(3);
        n1.next = new Node(6);
        n1.next.next = new Node(9);
        Node n4 = new Node(15);
        n1.next.next.next = n4;

        // Initialise list 2
        Node m1 = new Node(10);
        m1.next = n4;
        m1.next.next = new Node(30);

        getIntersectionNode(n1, m1);
    }
}
