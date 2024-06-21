package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class Example5 {
    public static void main (String[] args) {
        LinkedListDemo.Node head = new LinkedListDemo.Node(10);
        head.next = new LinkedListDemo.Node(20);
        head.next.next = new LinkedListDemo.Node(30);
        head.next.next.next = head;
        head = insertAtBegin2(head, 15);
        Example4.printList1(head);
    }

    public static LinkedListDemo.Node insertAtBegin(LinkedListDemo.Node head, int data) {
        LinkedListDemo.Node newNode = new LinkedListDemo.Node(data);
        if (head == null) {
            newNode.next = newNode;
        } else {
            LinkedListDemo.Node currentNode = head;
            while (currentNode.next != head) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.next = head;
        }
        return newNode;
    }

    public static LinkedListDemo.Node insertAtBegin2(LinkedListDemo.Node head, int data) {
        LinkedListDemo.Node newNode = new LinkedListDemo.Node(data);
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
