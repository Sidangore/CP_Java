package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class Example4 {
    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();

        LinkedListDemo.Node one = new LinkedListDemo.Node(10);
        LinkedListDemo.Node two = new LinkedListDemo.Node(20);
        LinkedListDemo.Node three = new LinkedListDemo.Node(30);
        LinkedListDemo.Node four = new LinkedListDemo.Node(40);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = one;

        printList1(two);
        printList2(three);
    }

    private static void printList2(LinkedListDemo.Node head) {
        if (head == null) {
            System.out.println("Head is null");
            return;
        }
        System.out.println("Data: " + head.data);
        for (LinkedListDemo.Node node = head.next; node != head; node = node.next) {
            System.out.println("Data: " + node.data);
        }
    }

    public static void printList1(LinkedListDemo.Node head) {
        LinkedListDemo.Node temp = head;
        if (head != null) {
            do {
                System.out.println("Data: " + temp.data);
                temp = temp.next;
            } while (temp != head);
        }
    }
}