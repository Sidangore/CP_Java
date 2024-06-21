/*
package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

import java.util.HashMap;
public class AllOne {
    public static class Node {
        String key;
        int count;
        Node next, previous;
        Node (String key) {
            this.key = key;
            this.next = null;
            this.previous = null;
            this.count = 1;
        }
    }
    HashMap<String, Node> map;
    Node head, tail;
    public AllOne() {
        this.map = new HashMap<>();
        this.head = new Node("");
        this.tail = new Node("");
        this.head.count = this.tail.count = -1;
        this.head.next = tail;
        this.head.previous = null;
        this.tail.previous = head;
        this.tail.next = null;
    }
    public void inc (String key) {
        if (this.map.get(key) != null) {
            // not a new key
            Node node = this.map.get(key);
            node.count++;
            add(node);
        } else {
            // completely a new key
            Node newNode = new Node(key);

        }
    }
    public void dec (String key) {

    }
    public String getMinKey () {
        return "";
    }
    public String getMaxKey () {
        return "";
    }
    public void add (Node node) {
        if (this.head.next == tail || this.head.next == null || this.head.next.count < node.count) {
            node.next = this.head.next;
            node.previous = this.head;
            this.head.next = node;
        } else {
            if (this.head.next.count )
        }

    }
    public static void main (String[] args) {

    }
}
*/
