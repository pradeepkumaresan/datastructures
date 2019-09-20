package com.pradeep.dataStructures.binaryTree;

import com.pradeep.dataStructures.exceptions.QueueOverFlowException;
import com.pradeep.dataStructures.queue.Queue;

/**
 * Nodes at one level will all be processed first before moving to next level.
 * Starting from root.
 */
public class BreadthFirstTraversal {

    public void traverse(Node root) throws QueueOverFlowException {
        Queue<Node> queue = new Queue<>();

        if(root == null)
            return;

        queue.enQueue(root);
        while(!queue.isEmpty()){
            Node node = queue.deQueue();
            System.out.println(node.getValue());

            if(node.getLeftChild() != null)
                queue.enQueue(node.getLeftChild());
            if(node.getRightChild() != null)
                queue.enQueue(node.getRightChild());
        }
    }
}
