package org.siddhantangore.dataStructuresAndAlgorithms.linkedlist;

import java.util.HashMap;

public class LFUCacheDesign {
    static class Node {
        int value;
        int key;
        int count;
        Node next;
        Node prev;
        Node (int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
            this.count = 0;
        }

    }
    static class LFUCache {
        int capacity, counter;
        Node head, tail;
        HashMap<Integer, Node> map;
        LFUCache(int capacity) {
            this.capacity = capacity;
            this.head = new Node(0, 0);
            this.tail = new Node(0, 0);
            this.head.next = this.tail;
            this.head.prev = null;
            this.tail.next = null;
            this.tail.prev = this.head;
            this.map = new HashMap<>();
            this.counter = 0;
        }
        void get(int key) {
            int result = -1;
            if (map.get(key) != null) {
                Node node = map.get(key);
                result = node.value;
                deleteThisNode(node);
                push(node);
            }
            System.out.println("Result = " + result);
        }
        void put(int key, int value) {
            if (map.get(key) != null) {
                Node node = map.get(key);
                node.value = value;
                deleteThisNode(node);
                push(node);
            } else {
                Node newNode = new Node(key, value);
                map.put(key, newNode);
                if (counter < capacity) {
                    counter++;
                    push(newNode);
                } else {
                    delete();
                    push(newNode);
                }
            }
        }
        void push(Node node) {
            node.count++;
            node.next = this.head.next;
            node.next.prev = node;
            node.prev = this.head;
            this.head.next = node;
        }
        void delete() {
            Node curr = this.head.next;
            Node leastUsedNode = this.head.next;
            while (curr != tail) {
                if (curr.count <= leastUsedNode.count) {
                    leastUsedNode = curr;
                }
                curr = curr.next;
            }
            map.remove(leastUsedNode.key);
            deleteThisNode(leastUsedNode);
        }
        void deleteThisNode(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

    }
    public static void main (String[] args) {
        LFUCache cache = new LFUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);
        cache.put(3, 3);
        cache.get(2);
        cache.get(3);
        cache.put(4, 4);
        cache.get(1);
        cache.get(3);
        cache.get(4);
    }
}
