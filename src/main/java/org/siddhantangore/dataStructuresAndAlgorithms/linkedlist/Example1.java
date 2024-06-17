package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class Example1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(3);

        list.head.next = second;
        second.next = third;

//        list.printList();
        list.insertNodeAtBeginning(4);
        list.deleteFirstNode();
        list.insertAtEnd(5);
        list.insertAtIndex(1, 6);
        list.insertAtIndex(0, 7);
        list.insertAtIndex(-2, 8);
        list.insertAtIndex(8, 9);
        list.printList();
//        list.printLLRecursively(list.head);
    }
}
