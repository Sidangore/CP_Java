package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class Example2 {
    public static void main (String[] args) {
        LinkedListDemo list = new LinkedListDemo();

        list.insertNodeAtBeginning(10);
        list.insertNodeAtBeginning(20);

        list.printList();

        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
    }
}
