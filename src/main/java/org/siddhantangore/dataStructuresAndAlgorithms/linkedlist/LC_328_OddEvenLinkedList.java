package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class LC_328_OddEvenLinkedList {
    public static ListNode push (ListNode head, int val) {
        return new ListNode(val, head);
    }
    public static void print (ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }
    public static ListNode oddEvenList (ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode evenNodeStart = null, evenNodeEnd = null, oddNodeStart = null, oddNodeEnd = null;
        ListNode currentNode = head;
        int position = 0;
        while (currentNode != null) {
            if (position % 2 == 0) {
                if (evenNodeStart == null) {
                    evenNodeStart = evenNodeEnd = currentNode;
                } else {
                    evenNodeEnd.next = currentNode;
                    evenNodeEnd = evenNodeEnd.next;
                }
            } else {
                if (oddNodeStart == null) {
                    oddNodeStart = oddNodeEnd = currentNode;
                } else {
                    oddNodeEnd.next = currentNode;
                    oddNodeEnd = oddNodeEnd.next;
                }
            }
            position++;
            currentNode = currentNode.next;
        }
        if (evenNodeStart == null || oddNodeStart == null) return head;
        evenNodeEnd.next = oddNodeStart;
        oddNodeEnd.next = null;
        head = evenNodeStart;
        return head;
    }
    public static void main (String[] args) {
        ListNode head = null;
        for (int i = 6; i > 0; i--){
            head = push(head, i);
        }
        print(head);
        head = oddEvenList(head);
        print(head);
    }
}
