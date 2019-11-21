package com.pradeep.dataStructures.linkedList;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public void addLast(T t) {
        if (head == null) {
            head = new Node<>(t);
            tail = head;
            return;
        }
        Node<T> node = new Node<>(t);
        tail.setNext(node);
        node.setPrevious(tail);
        tail = node;
    }

    public T removeLast() throws Exception {
        if (tail == null) {
            throw new Exception("list is empty");
        }
        if(tail.getPrevious() == null) {
            T val = tail.value;
            head = tail = null;
            System.out.println(val + " removed.");
            return val;
        }
        Node<T> returnVal = tail;
        tail = tail.getPrevious();
        tail.setNext(null);
        System.out.println(returnVal.value + " removed.");
        return returnVal.getValue();
    }

    public void traverse(){
        System.out.print("Traversing List - ");
        Node<T> node = head;
        while(node != null){
            System.out.print(node.value + " ");
            node = node.nextElement;
        }
        System.out.println();
    }

    public class Node<T> {
        private T value;
        private Node<T> nextElement;
        private Node<T> previousElement;

        Node(T t) {
            value = t;
        }

        T getValue() {
            return value;
        }

        void setValue(T t) {
            this.value = t;
        }

        Node<T> getPrevious() {
            return previousElement;
        }

        void setPrevious(Node<T> previousElement) {
            this.previousElement = previousElement;
        }

        void setNext(Node<T> node) {
            nextElement = node;
        }

        public Node<T> getNext() {
            return nextElement;
        }
    }
}















