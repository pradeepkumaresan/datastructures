package com.pradeep;

public class LinkedList {
    private class Node<T>{
        T value;
        Node<T> nextElement;

        Node(T t){
            value = t;
        }

        void setNextElement(Node<T> node){
            nextElement = node;
        }

        Node<T> getNextElement(){
            return nextElement;
        }
    }
}