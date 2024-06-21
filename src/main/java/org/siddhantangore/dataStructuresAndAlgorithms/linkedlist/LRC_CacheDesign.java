package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

import java.util.HashMap;

public class LRC_CacheDesign {
    public static void main (String[] args) {
        LRUCache cache = new LRUCache(2);
        // set and get
        cache.get(0);
        cache.set(1, 10);
        cache.set(2, 20);
        cache.get(2);
        cache.set(3, 30);
        cache.get(0);
        cache.get(0);
        cache.set(3, 40);
        cache.set(4, 40);
        cache.set(5, 50);
        cache.set(6, 60);
        cache.get(0);
        cache.get(6);
        cache.get(5);
        cache.get(4);

    }

}
class Node {
    int key, value;
    Node next;
    Node previous;
    Node (int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}
class LRUCache {
    int capacity, count;
    HashMap<Integer, Node> map;
    Node head, tail;
    LRUCache(int capacity) {
        this.capacity = capacity;
        count = 0;
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.previous = null;
        head.next = tail;
        tail.previous = head;
        tail.next = null;
        this.map = new HashMap<>();
    }
    private void pushNode (Node node) {
        node.next = head.next;
        node.next.previous = node;
        node.previous = head;
        head.next = node;
    }
    private void deleteNode(Node node) {
        node.previous.next = node.next;
        node.next.previous = node.previous;
    }
    public void set (int key, int value) {
        if (map.get(key) != null) {
            Node node = map.get(key);
            node.value = value;
            deleteNode(node);
            pushNode(node);
        } else {
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            if (count < capacity) {
                count++;
                pushNode(newNode);
            } else {
                map.remove(tail.previous.key);
                deleteNode(tail.previous);
                pushNode(newNode);
            }
        }
    }
    public void get (int key) {
        int result = -1;
        if (map.get(key) != null) {
            Node node = map.get(key);
            result = node.value;
            deleteNode(node);
            pushNode(node);
        }
        System.out.println("The result = " + result);
    }
}
