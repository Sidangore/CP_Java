package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class PalindromeLinkedList {
    Node head;
    static class Node {
        char data;
        Node next;
        Node (char data) {
            this.data = data;
            this.next = null;
        }
    }
    void push (char data) {
        Node node = new Node (data);
        node.next = this.head;
        this.head = node;
    }
    void print () {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }
    boolean isPalindrome () {
        Node fastNode = head, slowNode = head, previousOfSlowNode = head;
        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            previousOfSlowNode = slowNode;
            slowNode = slowNode.next;
        }
        Node midNode = null;
        if (fastNode != null) {
            midNode = slowNode;
            slowNode = slowNode.next;
        }
        previousOfSlowNode.next = null;
        Node secondHalf = slowNode;
        secondHalf = reverse(secondHalf);
        boolean result = compareList(head, secondHalf);
        secondHalf = reverse(secondHalf);
        if (midNode != null) {
            previousOfSlowNode.next = midNode;
            midNode.next = secondHalf;
        } else {
            previousOfSlowNode.next = secondHalf;
        }
        return result;
    }
    Node reverse(Node head) {
        Node previous = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    boolean compareList(Node n1, Node n2) {
        Node temp1 = n1, temp2 = n2;
        while (temp1 != null && temp2 != null) {
            if (temp1.data == temp2.data) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else {
                return false;
            }
        }
        return temp1 == null && temp2 == null;
    }
    public static void main (String[] args) {
        PalindromeLinkedList llist = new PalindromeLinkedList();
        char[] charArray = {'a', 'b', 'c', 'b', 'c', 'b', 'c', 'b', 'a'};
        for (char c: charArray) {
            llist.push(c);
        }
        llist.print();
        System.out.println("List is palindrome = " + llist.isPalindrome());
        llist.print();
    }
}
