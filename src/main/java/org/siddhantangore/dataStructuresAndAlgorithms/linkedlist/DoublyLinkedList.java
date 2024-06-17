package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class DoublyLinkedList {
    Node head;

    /**
     * Static inner class of Node
     */
    static class Node {
        int data;
        Node previous, next; // Here it has previous field along with next, to make it doubly linked
        Node (int data) {
            this.data = data;
            previous = null;
            next = null;
        }
    }

    /**
     * Inserting at the front of the DLL
     *
     * Time complexity = O(1)
     * Space complexity = O(1)
     */
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) {
            head.previous = newNode;
        }
        head = newNode;
    }

    public void insertAfter(Node previousNode, int data) {
        if (previousNode == null) {
            System.out.println("The previous node cannot be Null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
        if (newNode.next != null) {
            newNode.next.previous = newNode;
        }
    }

    public void insertBefore(Node nextNode, int data) {
        if (nextNode == null) {
            System.out.println("Next node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.previous = nextNode.previous;
        nextNode.previous = newNode;
        newNode.next = nextNode;
        if (newNode.previous != null) {
            newNode.previous.next = newNode;
        } else {
            head = newNode;
        }
    }

    public void printDLLIteratively() {
        Node current = head;
        while (current != null) {
            System.out.println("Data: " + current.data);
            current = current.next;
        }
    }

    public void getSize() {
        int size = 0;
        if (head == null) {
            System.out.println("Size = " + 0);
            return;
        }
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        System.out.println("Size = " + size);
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.previous = last;
    }

    public void reverse() {
        if (head == null) {
            System.out.println("The DLL is empty, hence, cannot be reversed");
            return;
        }
        Node temp = null;
        Node currentNode = head;
        while (currentNode != null) {
            temp = currentNode.previous;
            currentNode.previous = currentNode.next;
            currentNode.next = temp;
            currentNode = currentNode.previous;
        }
        if (temp != null) {
            head = temp.previous;
        }
    }

    public void deleteHead() {
        if (head == null) {
            System.out.println("Head is null, cannot be deleted");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
        head.previous = null;
        System.out.println("head deleted");
        return;
    }
}
