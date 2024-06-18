package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class DetectAndRemoveLoop {
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
    public static boolean isLoopPresent(Node head) {
        Node fastNode = head, slowNode = head;
        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (fastNode == slowNode) {
                return true;
            }
        }
        return false;
    }
    public static Node detectAndRemoveLoop(Node head) {
        if (!isLoopPresent(head)) {
            return head;
        }
        // 50 20 15 4 10 - 15
        /**
         * Iteration    1   2   3
         * fastNode 50  15  10  4
         * tempNode 50  20  4   15
         * slowNode 50  20  15  4
         */
        Node fastNode = head, slowNode = head, tempNode = head;
        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            tempNode = fastNode.next;
            slowNode = slowNode.next;
            if (slowNode == fastNode) {
                tempNode.next = null;
                break;
            }
        }
        return head;
    }
    public static void main (String[] args) {

        Node head = new Node(50);
        head.next = new Node(20);
        head.next.next = new Node(15);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(10);
        print(head);
        System.out.println("Loop = " + isLoopPresent(head));
        head.next.next.next.next.next = head.next.next;
        System.out.println("Loop = " + isLoopPresent(head));
//        print(head);
        print(detectAndRemoveLoop(head));
        System.out.println("Loop = " + isLoopPresent(head));
    }
}
