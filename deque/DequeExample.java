package deque;

import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // 뒤에 삽입 (큐처럼)
        deque.offerLast(1);
        deque.offerLast(2);
        System.out.println("After offerLast: " + deque); // [1, 2]

        // 앞에 삽입 (스택처럼)
        deque.offerFirst(3);
        System.out.println("After offerFirst: " + deque); // [3, 1, 2]

        // 앞에서 제거
        deque.pollFirst();
        System.out.println("After pollFirst: " + deque); // [1, 2]

        // 뒤에서 제거
        deque.pollLast();
        System.out.println("After pollLast: " + deque); // [1]

        // 조회
        System.out.println("peekFirst: " + deque.peekFirst()); // 1
        System.out.println("peekLast: " + deque.peekLast()); // 1

        // 추가 테스트 - 양쪽 삽입/제거
        deque.offerFirst(5);
        deque.offerLast(10);
        System.out.println("After offerFirst and offerLast: " + deque); // [5, 1, 10]

        deque.pollFirst();
        deque.pollLast();
        System.out.println("After pollFirst and pollLast: " + deque); // [1]
    }

}
