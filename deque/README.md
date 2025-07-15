# Deque 예제 (Java)

## 개념 요약

- **Deque (Double Ended Queue)**는 양쪽에서 삽입과 삭제가 모두 가능한 자료구조입니다.
- `ArrayDeque`를 사용하면 스택처럼도, 큐처럼도 구현할 수 있어 실전에서 매우 유용합니다.

---

## 주요 메서드

| 동작        | 메서드         |
| ----------- | -------------- |
| 앞에 삽입   | `offerFirst()` |
| 뒤에 삽입   | `offerLast()`  |
| 앞에서 제거 | `pollFirst()`  |
| 뒤에서 제거 | `pollLast()`   |
| 앞 값 확인  | `peekFirst()`  |
| 뒤 값 확인  | `peekLast()`   |

---

## 코드 예시

```java
Deque<Integer> deque = new ArrayDeque<>();

// 큐처럼 사용
deque.offerLast(1);
deque.offerLast(2);
deque.pollFirst();     // 1 제거

// 스택처럼 사용
deque.offerFirst(3);
deque.pollLast();      // 2 제거

deque.peekFirst();     // 앞값 확인
deque.peekLast();      // 뒷값 확인
```
