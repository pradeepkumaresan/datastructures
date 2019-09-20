package com.pradeep.dataStructures.queue;

/**
 * Test a queue
 */
public class QueueTest {
    public static void main(String[] args) throws Exception{
        Queue<String> queue = new Queue<>();
        queue.enQueue("P");
        queue.enQueue("R");
        queue.enQueue("A");
        queue.enQueue("D");
        queue.printQueue();

        queue.enQueue("E");
        queue.enQueue("E");
        queue.enQueue("P");
        queue.printQueue();

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.printQueue();

        queue.enQueue("A");
        queue.enQueue("R");
        queue.enQueue("P");
        queue.printQueue();
    }
}
