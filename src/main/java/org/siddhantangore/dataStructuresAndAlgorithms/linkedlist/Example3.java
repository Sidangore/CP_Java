package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class Example3 {
    public static void main (String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert elements at the front
        dll.insertAtFront(10);
        dll.insertAtFront(20);
        dll.insertAtFront(30);

        // Print DLL
        dll.printDLLIteratively();
        dll.getSize();

        // Insert at end
        dll.insertAtEnd(40);
        dll.insertAtEnd(50);

        dll.printDLLIteratively();

        dll.getSize();

        // Reverse a DLL
        dll.reverse();

        dll.printDLLIteratively();

        // Insert before
        DoublyLinkedList.Node node = new DoublyLinkedList.Node(40);
        dll.insertBefore(node, 60);
        dll.insertAfter(node, 70);

        dll.printDLLIteratively();
        dll.getSize();

        // Delete head
        dll.deleteHead();

        dll.printDLLIteratively();
        dll.getSize();
    }
}
