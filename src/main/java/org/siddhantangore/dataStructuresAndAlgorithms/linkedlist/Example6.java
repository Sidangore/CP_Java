package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class Example6 {
    public static void main (String[] args) {
        LinkedListDemo.Node head = new LinkedListDemo.Node(10);
        head.next = new LinkedListDemo.Node(20);
        head.next.next = new LinkedListDemo.Node(30);
        head.next.next.next = new LinkedListDemo.Node(40);
        head.next.next.next.next = head;

        Example4.printList1(head);
        head = deleteHead(head);
        Example4.printList1(head);
    }

    private static LinkedListDemo.Node deleteHead(LinkedListDemo.Node head) {
        if (head == null || head.next == head) {
            return null;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

}
