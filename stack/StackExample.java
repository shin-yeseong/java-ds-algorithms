package stack;

import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Stack peek: " + stack.peek()); // 20
        stack.pop();
        System.out.println("Stack peek after pop: " + stack.peek()); // 10

        // ArrayDeque를 이용한 스택 구현
        Deque<Integer> dequeStack = new ArrayDeque<>();
        dequeStack.offerLast(100);
        dequeStack.offerLast(200);
        System.out.println("Deque as Stack peek: " + dequeStack.peekLast()); // 200
        dequeStack.pollLast();
        System.out.println("Deque as Stack peek after pop: " + dequeStack.peekLast()); // 100
    }
}