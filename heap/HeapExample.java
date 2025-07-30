package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapExample {
    public static void main(String[] args) {
        // 최소 힙 (기본 PriorityQueue)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(30);

        System.out.println("Min Heap peek: " + minHeap.peek()); // 출력: 5
        minHeap.poll(); // 가장 작은 값 제거
        System.out.println("Min Heap peek after poll: " + minHeap.peek()); // 출력: 10
        System.out.println("Min Heap size: " + minHeap.size()); // 출력: 2

        System.out.println();

        // 최대 힙 (reverseOrder로 정렬 기준 변경)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(30);

        System.out.println("Max Heap peek: " + maxHeap.peek()); // 출력: 30
        maxHeap.poll(); // 가장 큰 값 제거
        System.out.println("Max Heap peek after poll: " + maxHeap.peek()); // 출력: 10
        System.out.println("Max Heap size: " + maxHeap.size()); // 출력: 2
    }
}
