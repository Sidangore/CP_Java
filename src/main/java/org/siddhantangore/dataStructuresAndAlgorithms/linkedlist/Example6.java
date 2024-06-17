package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class Example6 {
    public static void main (String[] args) {
        LinkedList.Node head = new LinkedList.Node(10);
        head.next = new LinkedList.Node(20);
        head.next.next = new LinkedList.Node(30);
        head.next.next.next = new LinkedList.Node(40);
        head.next.next.next.next = head;

        Example4.printList1(head);
        head = deleteHead(head);
        Example4.printList1(head);
    }

    private static LinkedList.Node deleteHead(LinkedList.Node head) {
        if (head == null || head.next == head) {
            return null;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

}
