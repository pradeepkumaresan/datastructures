package com.pradeep.queue;

import com.pradeep.exceptions.QueueOverFlowException;

/**
 *
 * @param <T>
 */
public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    /**
     *
     * @param val
     */
    public void enQueue(T val){
        if(isEmpty()){
            head = new Node<>(val);
            tail = head;
            size++;
            return;
        }
        Node<T> node  = new Node<>(val);
        tail.nextNode = node;
        tail = node;
    }

    /**
     *
     * @return
     * @throws QueueOverFlowException
     */
    public T deQueue() throws QueueOverFlowException {
        if(isEmpty()){
            throw new QueueOverFlowException();
        }
        T returnVal = head.val;
        head = head.nextNode;
        size--;
        return returnVal;
    }

    /**
     *
     * @return
     */
    public boolean isEmpty(){
        return head == null;
    }

    /**
     *
     * @param <T>
     */
    private class Node<T>{
        private T val;
        private Node<T> nextNode;

        Node(T t){
            val = t;
        }
    }
}
