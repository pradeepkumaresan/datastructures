package com.pradeep.datastructures.binarytree;

import com.pradeep.datastructures.exceptions.QueueOverFlowException;
import com.pradeep.datastructures.queue.Queue;

public class BreadthFirstTraversal {

    public void traverse(Node root) throws QueueOverFlowException {
        Queue<Node> queue = new Queue<>();

        if(root == null)
            return;

        queue.enQueue(root);
        while(!queue.isEmpty()){
            Node node = queue.deQueue();
            System.out.println(node.toString());

            if(node.getLeftChild() != null)
                queue.enQueue(node.getLeftChild());
            if(node.getRightChild() != null)
                queue.enQueue(node.getRightChild());
        }
    }
}
