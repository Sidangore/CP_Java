package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

import java.util.Map;
import java.util.HashMap;

public class LoopInLinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            next = null;
        }
    }
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public static void print(Node head) {
        if (head == null) {
            System.out.println("LinkedList if empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println("Data: " + currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static boolean hasLoop(Node head) {
        Map<Node, Integer> map = new HashMap<>();
        while (head != null) {
            if (map.containsKey(head)) {
                return true;
            }
            map.put(head, 0);
            head = head.next;
        }
        return false;
    }

    public static boolean hasLoop2(Node head) {
        Node slowNode = head, fastNode = head;
        while (slowNode != null && fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if (slowNode == fastNode) {
                return true;
            }
        }
        return false;
    }

    /**
     * 10 20 30 40 50
     *       |______|
     * @param args
     */
    public static void main (String[] args) {
        Node n1 = new Node(10);
        n1.next = new Node(20);
        n1.next.next = new Node(30);
        n1.next.next.next = new Node(40);
        n1.next.next.next.next = new Node(50);
        n1.next.next.next.next.next = n1.next.next;

        System.out.println("Is loop in the linked list = " + hasLoop2(n1));
    }
}
