package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class LinkedList {
    Node head; // Is the First Node of the LinkedList

    /**
     * This class is made static because it can be used / accessed only for the given object of the LinkedList class
     *
     */
    static class Node {
        int data; // Stores the numerical value
        Node next; // Stores the reference/pointer to the next Node

        /**
         * Parameterised constructor to Initialise a new Node with numerical data
         * @param data
         */
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Iterates of the given LinkedList and prints all the values in it.
     * Starting from the head Node it iterates over to the last Node,
     * given that the last Node's next == null
     *
     * Time complexity = O(N)
     * Space complexity = O(1)
     */
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println("Data: " + current.data);
            current = current.next;
        }
    }

    /**
     * Creates a new Node,
     * sets the new Node's next as current head's next
     * and then set the head as the new Node
     *
     * Time complexity = O(1)
     * Space complexity = O(1)
     * @param data
     */
    public void insertNodeAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /** Insert a Node after a Node
     *
     * Time complexity = O(1)
     * Space Complexity = O(1)
     * @param previousNode
     * @param data
     */
    public void insertAfterANode(Node previousNode, int data) {
        if (head == null) {
            insertNodeAtBeginning(data);
            return;
        }
        if (previousNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
    }

    /** Insert at the end
     * Time complexity = O(N)
     * Space complexity = O(1)
     * @param data
     */
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return;
    }

    /**
     * Printing the LL Recursively
     *
     * @param head
     */
    public void printLLRecursively(Node head) {
        if (head == null) {
            return;
        }
        System.out.println("Data: " + head.data);
        printLLRecursively(head.next);
    }

    /**
     * Deleting the First Node
     */
    public void deleteFirstNode() {
        if (head == null) {
            System.out.println("First node not available to be deleted");
            return;
        }

        head = head.next;
    }

    /**
     * Deleting the last Node
     */
    public void deleteLastNode() {
        if (head == null) {
            System.out.println("Last node not available to be deleted");
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return;
    }

    /**
     * 1 2 3 4 5
     * (0, 6) -> 6 1 2 3 4 5
     * (2, 7) -> 6 1 7 2 3 4 5
     * (-3, 8) -> OOB
     * (10, 9) -> OOB
     * @param index
     * @param data
     */
    public void insertAtIndex(int index, int data) {
        /*if (index == 0) {
            insertNodeAtBeginning(data);
            return;
        }
        if (head == null || index < 0) {
            System.out.println("Index is out of bounds");
            return;
        }
        Node current = head;
        int position = 0;
        // 4 1 2 3 5
        while (current.next != null) {
            position++;
            current = current.next;
        }
        if (position + 1 != index) {
            System.out.println("Index cannot be added as it is out of bound");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;*/

        int position = 0;
        if (position == index) {
            insertNodeAtBeginning(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            while (current != null && position != index - 1) {
                position++;
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            } else {
                System.out.println("Index seems out of bounds");
            }
        }
    }

    /**
     * Searching the LL Iteratively
     *
     * @param x
     * @return
     */
    public int search(int x) {
        int position = 1;
        Node current = head;
        while (current != null) {
            if (current.data == x) {
                return position;
            }
            position++;
            current = current.next;
        }
        return -1;
    }
}
