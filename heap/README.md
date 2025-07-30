# Java 힙(Heap) 정리

## 개념 요약

- **힙(Heap)**은 **완전 이진 트리** 기반의 자료구조입니다.
- 우선순위 큐(Priority Queue)를 구현하기 위해 사용되며,  
  **항상 가장 높은(또는 낮은) 우선순위 값을 빠르게 꺼낼 수 있도록** 설계되어 있습니다.

### 힙의 종류

| 종류        | 설명                                                     |
| ----------- | -------------------------------------------------------- |
| **최소 힙** | 부모 노드의 값이 자식 노드보다 작음 → 루트 노드는 최솟값 |
| **최대 힙** | 부모 노드의 값이 자식 노드보다 큼 → 루트 노드는 최댓값   |

---

## 힙과 우선순위 큐의 차이

| 항목                | 설명                                            |
| ------------------- | ----------------------------------------------- |
| **힙(Heap)**        | 우선순위 큐를 구현하기 위한 자료구조 (구현체)   |
| **우선순위 큐(PQ)** | ADT (추상 자료형), 가장 우선순위 높은 값을 꺼냄 |

---

## Java에서 힙 구현

Java에서는 `PriorityQueue` 클래스를 통해 **기본적으로 최소 힙**을 제공하며,  
**최대 힙**은 `Collections.reverseOrder()`를 활용해 생성합니다.

### 주요 메서드 요약

| 메서드       | 설명                                      |
| ------------ | ----------------------------------------- |
| `add(E e)`   | 요소 삽입. 공간이 부족하면 예외 발생      |
| `offer(E e)` | 요소 삽입. 공간 부족 시 false 반환 (안전) |
| `poll()`     | 가장 우선순위 높은 요소 제거 후 반환      |
| `peek()`     | 가장 우선순위 높은 요소 조회 (제거 안 함) |
| `size()`     | 현재 큐의 크기 반환                       |
| `isEmpty()`  | 큐가 비었는지 여부 확인                   |

---

## 최소 힙 예제

```java
import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(30);
        minHeap.add(10);
        minHeap.add(20);

        System.out.println(minHeap.poll()); // 10
        System.out.println(minHeap.poll()); // 20
        System.out.println(minHeap.peek()); // 30
    }
}
```

## 최대 힙 예제

```java
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(30);
        maxHeap.offer(10);
        maxHeap.offer(20);

        System.out.println(maxHeap.poll()); // 30
        System.out.println(maxHeap.poll()); // 20
        System.out.println(maxHeap.peek()); // 10
    }
}
```

---

## String도 가능할까?

- `PriorityQueue<String>`도 사용 가능!
- 기본 정렬 기준은 **사전순 (오름차순)**
- `Collections.reverseOrder()`로 **내림차순 정렬**도 가능

```java
import java.util.PriorityQueue;

public class StringHeapExample {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("banana");
        pq.add("apple");
        pq.add("carrot");

        System.out.println(pq.poll()); // apple (사전순으로 가장 앞에 있는 값)
    }
}
```

### 내림차순 정렬로 사용하고 싶다면?

```java
import java.util.Collections;
import java.util.PriorityQueue;

public class ReverseStringHeap {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add("banana");
        pq.add("apple");
        pq.add("carrot");

        System.out.println(pq.poll()); // carrot (사전순으로 가장 뒤에 있는 값)
    }
}
```

---

## 느낀 점

- 자바에서는 직접 힙을 구현하지 않아도 PriorityQueue 덕분에 간편하게 사용할 수 있음

- 힙과 우선순위 큐의 개념이 비슷해서 헷갈릴 수 있으나,
  반드시 구현체(힙) vs 추상 자료형(우선순위 큐) 로 구분해서 기억할 것!
