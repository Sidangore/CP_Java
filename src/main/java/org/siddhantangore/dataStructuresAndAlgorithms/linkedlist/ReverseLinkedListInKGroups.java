package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

import java.math.BigInteger;

public class ReverseLinkedListInKGroups {
    Node head;
    static class Node {
        int data;
        Node next;
        Node (int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public static void print (Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.print("NULL\n");
    }
    public static Node reverseKGroups (Node head, int k) {
        Node dummy = new Node(0, head);
        Node previousGroup = dummy;
        while (true) {
            Node kthNode = getKthNode (previousGroup, k);
            if (kthNode == null) {
                break;
            }
            Node nextGroup = kthNode.next;
            Node previousNode = kthNode.next, currentNode = previousGroup.next;
            while (currentNode != nextGroup) {
                Node temp = currentNode.next;
                currentNode.next = previousNode;
                previousNode = currentNode;
                currentNode = temp;
            }
            Node temp = previousGroup.next;
            previousGroup.next = kthNode;
            previousGroup = temp;
        }
        return dummy.next;
    }
    public static Node getKthNode (Node currentNode, int k) {
        while (currentNode != null && k > 0) {
            currentNode = currentNode.next;
            k--;
        }
        return currentNode;
    }
    public static void main (String[] args) {
        Node head = new Node(1, null);
        Node temp = head;
        for (int i = 2; i < 6; i++) {
            Node newNode = new Node(i, null);
            temp.next = newNode;
            temp = temp.next;
        }
        print(head);
        print(reverseKGroups(head, 2));
    }
}
