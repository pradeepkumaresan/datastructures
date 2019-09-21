package com.pradeep.dataStructures.binarySearchTree;

import com.pradeep.dataStructures.binaryTree.Node;

/**
 * It is an ordered/sorted tree.
 * Left tree is lesser than node.
 * Right tree is greater than node.
 * insert - O(log(n)) for a balanced tree. O(n) for skewed tree.
 * lookup - O(log(n)) for a balanced tree. O(n) for skewed tree.
 */
public class BinarySearchTree<T extends Comparable<T>> {

    Node<T> insert(Node<T> root, Node<T> node){
        if(root == null){
            return node;
        }

        if(node.compareTo(root) <= 0){
            root.setLeftChild(insert(root.getLeftChild(), node));
        }
        else{
            root.setRightChild(insert(root.getRightChild(), node));
        }

        return root;
    }

    Node<T> lookUp(Node<T> root, Node<T> val){
        if(root == null){
            return null;
        }

        if(val.compareTo(root) == 0){
            return root;
        }

        if(val.compareTo(root) < 0){
            return lookUp(root.getLeftChild(), val);
        }
        else{
            return lookUp(root.getRightChild(), val);
        }
    }

    T minValueOfTree(Node<T> root){
        if(root == null)
            return null;

        if(root.getLeftChild() == null)
            return root.getValue();

        return minValueOfTree(root.getLeftChild());
    }

    int maxDepth(Node<T> root){
        if(root == null)
            return 0;

        if(root.getLeftChild() == null && root.getRightChild() == null)
            return 0;

        int leftMaxDepth = 1 + maxDepth(root.getLeftChild());
        int rightMaxDepth = 1 + maxDepth(root.getRightChild());

        return Math.max(leftMaxDepth, rightMaxDepth);
    }

    Node<T> mirror(Node<T> root){
        if(root == null)
            return null;

        mirror(root.getLeftChild());
        mirror(root.getRightChild());

        Node<T> node = root.getLeftChild();
        root.setLeftChild(root.getRightChild());
        root.setRightChild(node);

        return root;
    }












    Node<Integer> delete(Node<Integer> root, int val){
        if(root == null){
            return null;
        }

        if(val < root.getValue()){
            root.setLeftChild(delete(root.getLeftChild(), val));
        }
        else if(val > root.getValue()){
            root.setRightChild(delete(root.getRightChild(), val));
        }

        // if key is same as root's key, then This is the node
        // to be deleted
        else
        {
            // node with only one child or no child
            if (root.getValue() == null)
                return root.getRightChild();
            else if (root.getRightChild() == null)
                return root.getLeftChild();

            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.setValue(minValue(root.getRightChild()));

            // Delete the inorder successor
            root.setRightChild(delete(root.getRightChild(), root.getValue()));
        }

        return root;
    }

    int minValue(Node<Integer> root)
    {
        int minv = root.getValue();
        while (root.getLeftChild() != null)
        {
            minv = root.getLeftChild().getValue();
            root = root.getLeftChild();
        }
        return minv;
    }
}
