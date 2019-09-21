package com.pradeep.dataStructures.binaryTree;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    private T value;
    private Node<T> leftChild;
    private Node<T> rightChild;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public int compareTo(Node<T> o) {
        return this.getValue().compareTo(o.getValue());
    }
}
