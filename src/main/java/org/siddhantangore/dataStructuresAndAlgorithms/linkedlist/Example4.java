package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class Example4 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        LinkedList.Node one = new LinkedList.Node(10);
        LinkedList.Node two = new LinkedList.Node(20);
        LinkedList.Node three = new LinkedList.Node(30);
        LinkedList.Node four = new LinkedList.Node(40);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = one;

        printList1(two);
        printList2(three);
    }

    private static void printList2(LinkedList.Node head) {
        if (head == null) {
            System.out.println("Head is null");
            return;
        }
        System.out.println("Data: " + head.data);
        for (LinkedList.Node node = head.next; node != head; node = node.next) {
            System.out.println("Data: " + node.data);
        }
    }

    public static void printList1(LinkedList.Node head) {
        LinkedList.Node temp = head;
        if (head != null) {
            do {
                System.out.println("Data: " + temp.data);
                temp = temp.next;
            } while (temp != head);
        }
    }
}