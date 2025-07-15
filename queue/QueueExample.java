package queue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class QueueExample {
    public static void main(String[] args) {
        // LinkedList 기반 Queue
        Queue<Integer> linkedQueue = new LinkedList<>();
        linkedQueue.offer(1);
        linkedQueue.offer(2);
        System.out.println("LinkedList Queue peek: " + linkedQueue.peek()); // 1
        linkedQueue.poll();
        System.out.println("LinkedList Queue after poll: " + linkedQueue.peek()); // 2

        // ArrayDeque 기반 Queue
        Queue<Integer> arrayQueue = new ArrayDeque<>();
        arrayQueue.offer(10);
        arrayQueue.offer(20);
        System.out.println("ArrayDeque Queue peek: " + arrayQueue.peek()); // 10
        arrayQueue.poll();
        System.out.println("ArrayDeque Queue after poll: " + arrayQueue.peek()); // 20
    }
}
