package com.pradeep.datastructures.linkedList;

public class LinkedListTest {
    public static void main(String[] args) throws Exception{
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.traverse();

        list.addLast(3);
        list.addLast(4);
        list.traverse();

        list.addLast(5);
        list.traverse();

        list.removeLast();
        list.removeLast();
        list.removeLast();
        list.traverse();

        list.removeLast();
        list.traverse();

        list.removeLast();
        list.traverse();
    }
}
