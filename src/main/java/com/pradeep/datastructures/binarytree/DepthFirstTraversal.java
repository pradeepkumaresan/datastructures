package com.pradeep.datastructures.binarytree;

public class DepthFirstTraversal {
    public void preOrder(Node root){
        if(root == null)
            return;

        System.out.println(root.getValue());

        preOrder(root.getLeftChild());
        preOrder(root.getRightChild());
    }

    public void inOrder(Node root){
        if(root == null)
            return;

        inOrder(root.getLeftChild());
        System.out.println(root.getValue());
        inOrder(root.getRightChild());
    }

    public void postOrder(Node root){
        if(root == null)
            return;

        preOrder(root.getLeftChild());
        preOrder(root.getRightChild());
        System.out.println(root.getValue());
    }
}
