package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

public class SegregateEvenOddNodes {
    Node head;
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void print () {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }
    public void push (int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    /*public void segregateEvenOddNodes() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node lastEvenNode = null;
        Node lastOddNode = null;
        Node currentNode = head;
        while (currentNode != null && (lastEvenNode == null || lastOddNode == null)) {
            if (currentNode.data % 2 == 0 && lastEvenNode == null) {
                lastEvenNode = currentNode;
            } else if (currentNode.data % 2 != 0 && lastOddNode == null){
                lastOddNode = currentNode;
            }
            currentNode = currentNode.next;
        }
        if (lastEvenNode == null || lastOddNode == null) return;
        while (currentNode != null) {
            if (currentNode.data % 2 == 0) {
                lastOddNode.next = currentNode.next;
                currentNode.next = lastOddNode;
                lastEvenNode.next = currentNode;
                lastEvenNode = currentNode;
                currentNode = lastOddNode.next;
            } else if (currentNode.data % 2 != 0){
                lastOddNode = currentNode;
                currentNode = currentNode.next;
            }
//            currentNode = currentNode.next;
        }
        System.out.println("Even node = " + lastEvenNode.data);
        System.out.println("Odd node = " + lastOddNode.data);
//        System.out.println("Current node = " + currentNode.data);
    }*/
    public void segregateEvenOddNodes() {
        Node evenStartNode = null, evenEndNode = null, oddStartNode = null, oddEndNode = null;
        Node currentNode = head;
        while (currentNode != null) {
            int d = currentNode.data;
            if (d % 2 == 0) {
                if (evenStartNode == null) {
                    evenStartNode = evenEndNode = currentNode;
                } else {
                    evenEndNode.next = currentNode;
                    evenEndNode = evenEndNode.next;
                }
            } else {
                if (oddStartNode == null) {
                    oddStartNode = oddEndNode = currentNode;
                } else {
                    oddEndNode.next = currentNode;
                    oddEndNode = oddEndNode.next;
                }
            }
            currentNode = currentNode.next;
        }
        if (evenStartNode == null || oddStartNode == null) {
            return;
        }
        evenEndNode.next = oddStartNode;
        oddEndNode.next = null;
        head = evenStartNode;
    }
    public static void main (String[] args) {
        SegregateEvenOddNodes list = new SegregateEvenOddNodes();
        list.push(11);
        list.push(10);
        list.push(9);
        list.push(6);
        list.push(4);
        list.push(1);
        list.push(0);
        System.out.println("Initial LinkedList : ");
        list.print();
        list.segregateEvenOddNodes();
        list.print();
    }
}
