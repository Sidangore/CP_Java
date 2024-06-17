package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class ReverseALinkedList {
    static Node head;
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

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;

    }
    public static void main (String[] args) {
        ReverseALinkedList list = new ReverseALinkedList();

        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);

        list.printList();

        list.reverse();

        System.out.println();
        list.printList();
    }
}
