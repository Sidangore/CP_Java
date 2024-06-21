package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

class MyHashSet {
    Node head;
    static class Node {
        int key;
        Node next;
        Node (int key) {
            this.key = key;
            this.next = null;
        }
    }

    public MyHashSet() {
        this.head = new Node(-1);
    }

    public void add(int key) {
        if (!contains(key)) {
            Node node = new Node(key);
            node.next = this.head.next;
            this.head.next = node;
        }
    }

    public void remove(int key) {
        if (contains(key)) {
            Node currentNode = this.head;
            Node previousNode = this.head;
            while (currentNode != null) {
                if (currentNode.key == key) {
                    previousNode.next = currentNode.next;
                    currentNode.next = null;
                }
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
    }

    public boolean contains(int key) {
        Node currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.key == key) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public static void main (String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(1);
        set.add(2);
        System.out.println(set.contains(1));
        System.out.println(set.contains(3));
        set.add(2);
        System.out.println(set.contains(2));
        set.remove(2);
        System.out.println(set.contains(2));
    }
}

