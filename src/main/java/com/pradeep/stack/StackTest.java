package com.pradeep.stack;

public class StackTest {
    public static void main(String[] args) throws Exception {
        Stack<String> stack = new Stack<>();
        //stack.pop();
        stack.push("P");
        stack.push("R");
        stack.push("A");
        stack.push("D");
        stack.push("E");
        stack.push("E");
        stack.push("P");
        stack.printStack();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.printStack();

    }
}
