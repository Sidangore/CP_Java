package org.siddhantangore.dataStructuresAndAlgorithms;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Node has 3 elements
 * 1. Data
 * 2. Left pointer
 * 3. Right pointer
 *
 * Insertion in Binary tree
 * Check if there is any node in Binary Tree which has missing Left child.
 *      If it exists then insert new Node as its left child.
 *
 * Check if there is any node in Binary Tree which has missing Right child.
 *      If it exists then insert new Node as its right child.
 *
 * If we do not find any Node with Missing Left / Right Node.
 *      Then find a Node which has both Left and Right child missing
 *      And Add new Node to any of the Left or Right of the Node.
 *
 * Traversal in Binary Tree
 * 1. DFS - Depth First Search
 *      1.1. Pre-Order Traversal (current-left-right)
 *      1.2. In-Order Traversal (left-current-right)
 *      1.3. Post-Order Traversal (left-right-current)
 *
 * 2. BFS - Breadth First Search
 *      2.1. Level Order Traversal - Visit nodes level wise and left to right fashion
 *
 * Deletion in Binary Tree
 * Starting at the root, find the deepest and rightmost node in the binary tree
 *      and the node which we want to delete.
 * Replace the deepest rightmost node’s data with the node to be deleted.
 * Then delete the deepest rightmost node.
 *
 * Searching in the Binary Tree
 * Start from the root node.
 * Check if the current node’s value is equal to the target value.
 * If the current node’s value is equal to the target value,
 *      then this node is the required node.
 * Otherwise, if the node’s value is not equal to the target value,
 *      start the search in the left and right child.
 * If we do not find any node whose value is equal to target,
 *      then the value is not present in the tree.
 *
 *
 */
public class BinaryTree {
    public static Node insert(Node root, int data) {
        // If the tree is empty the new node becomes the root node
        if (root == null) {
            root = new Node(data);
            return root;
        }
        // Queue to traverse the Tree and find the position to insert the new Node
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            // Insert the Node as the Left child of the Parent Node
            if (temp.left == null) {
                temp.left = new Node(data);
                break;
            }
            // If Left child is Not Null then push it to the Queue
            else {
                queue.offer(temp.left);
            }

            // Insert the Node as the Right child of the Parent Node
            if (temp.right == null) {
                temp.right = new Node(data);
                break;
            }
            // If Right child is Not Null then push it to the Queue
            else {
                queue.offer(temp.right);
            }
        }
        return root;
    }

}

class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        this.left = this.right = null;
    }
}