package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class Example5 {
    public static void main (String[] args) {
        LinkedList.Node head = new LinkedList.Node(10);
        head.next = new LinkedList.Node(20);
        head.next.next = new LinkedList.Node(30);
        head.next.next.next = head;
        head = insertAtBegin2(head, 15);
        Example4.printList1(head);
    }

    public static LinkedList.Node insertAtBegin(LinkedList.Node head, int data) {
        LinkedList.Node newNode = new LinkedList.Node(data);
        if (head == null) {
            newNode.next = newNode;
        } else {
            LinkedList.Node currentNode = head;
            while (currentNode.next != head) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.next = head;
        }
        return newNode;
    }

    public static LinkedList.Node insertAtBegin2(LinkedList.Node head, int data) {
        LinkedList.Node newNode = new LinkedList.Node(data);
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        } else {
            newNode.next = head.next;
            head.next = newNode;
            int tempData = head.data;
            head.data = newNode.data;
            newNode.data = tempData;
            return head;
        }
    }
}
