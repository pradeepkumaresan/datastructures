package com.pradeep.stack;

import com.pradeep.exceptions.StackOverFlowException;
import com.pradeep.exceptions.StackUnderFlowException;

/**
 *
 * @param <T>
 */
public class Stack<T> {
    private Node<T> top;
    private int size = 0;
    private static final int MAX_SIZE = 50;

    /**
     * @param val
     * @throws StackOverFlowException
     */
    public void push(T val) throws StackOverFlowException {
        if (size == MAX_SIZE)
            throw new StackOverFlowException();

        top = new Node<>(val, top);
        size++;
    }

    /**
     * @return
     * @throws StackUnderFlowException
     */
    public T pop() throws StackUnderFlowException {
        if (size == 0) {
            throw new StackUnderFlowException();
        }

        T returnVal = top.val;
        top = top.nextNode;
        size--;
        return returnVal;
    }

    /**
     *
     * @return
     * @throws StackUnderFlowException
     */
    public T peek() throws StackUnderFlowException{
        if(size == 0){
            throw new StackUnderFlowException();
        }
        return top.val;
    }

    /**
     *
     * @return
     */
    public int size(){
        return size;
    }

    public void printStack(){
        Node<T> node = top;
        while(node != null){
            System.out.println(node.val);
            node = node.nextNode;
        }
        System.out.println();
    }

    /**
     *
     * @param <T>
     */
    private class Node<T> {
        private T val;
        private Node<T> nextNode;

        Node(T t, Node<T> nextNode) {
            val = t;
            this.nextNode = nextNode;
        }
    }
}


