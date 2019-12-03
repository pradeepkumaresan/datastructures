package com.pradeep.algorithms.linkedListProblems;

import com.pradeep.dataStructures.linkedList.LinkedList.Node;

/**
 * Floyd's/ Tortoise and Hare algorithm to detect loop in a linked List.
 * https://www.youtube.com/watch?v=zbozWoMgKW0
 */
public class DetectLoopInLinkedList {
    public static Node detectLoop(Node head) {
        Node hare = head;
        Node tortoise = head;

        while (tortoise != null
                && hare != null
                && hare.getNext() != null) {
            tortoise = tortoise.getNext();
            hare = hare.getNext().getNext();

            if(hare == tortoise)
                return hare;
        }
        return null;
    }

    public static Node findStartingPointOfLoopAndRemoveIt(Node head){
        Node meetingPoint = detectLoop(head);

        if(meetingPoint == null){
            return null;
        }

        Node temp = head;

        while(temp != meetingPoint){
            temp = temp.getNext();
            meetingPoint = meetingPoint.getNext();
        }
        temp = null;
        return meetingPoint;
    }
}
