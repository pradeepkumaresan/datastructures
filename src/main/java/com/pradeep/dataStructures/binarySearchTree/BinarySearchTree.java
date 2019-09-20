package com.pradeep.dataStructures.binarySearchTree;

import com.pradeep.dataStructures.binaryTree.Node;

/**
 * It is an ordered/sorted tree.
 * Left tree is lesser than node.
 * Right tree is greater than node.
 * insert - O(log(n)) for a balanced tree. O(n) for skewed tree.
 * lookup - O(log(n)) for a balanced tree. O(n) for skewed tree.
 */
public class BinarySearchTree {

    Node<Integer> insert(Node<Integer> root, Node<Integer> node){
        if(root == null){
            return node;
        }

        if(node.getValue() <= root.getValue()){
            root.setLeftChild(insert(root.getLeftChild(), node));
        }
        else{
            root.setRightChild(insert(root.getRightChild(), node));
        }

        return root;
    }

    Node<Integer> lookUp(Node<Integer> root, int val){
        if(root == null){
            return null;
        }

        if(val == root.getValue()){
            return root;
        }

        if(val < root.getValue()){
            return lookUp(root.getLeftChild(), val);
        }
        else{
            return lookUp(root.getRightChild(), val);
        }
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
