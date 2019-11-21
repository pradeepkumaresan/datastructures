package com.pradeep.algorithms.linkedList;

import com.pradeep.dataStructures.linkedList.LinkedList;
import com.pradeep.dataStructures.linkedList.LinkedList.Node;

/**
 * length of 2 LLs provided.
 */
public class FindIntersectionOfTwoLL {
    public static Node findIntersection(Node head1, Node head2, int l1, int l2){
        int diff;
        if(l1 - l2 > 0)
            diff = l1 - l2;
        else{
            diff = l2 - l1;
            Node temp = head1;
            head1 = head2;
            head2 = temp;
        }
        for(int i=0; i<diff; i++){
            head1 = head1.getNext();
        }

        while(head1 != null
                && head2 != null
                && head1 != head2){
            head1 = head1.getNext();
            head2 = head2.getNext();
        }
        return head1;
    }
}
