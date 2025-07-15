# Stack 예제 (Java)

## 개념 요약

- **Stack**은 후입선출(LIFO: Last In First Out) 구조의 자료구조입니다.
- 자바에서는 `java.util.Stack` 클래스를 사용할 수 있으며,
  성능이나 사용성 면에서 `ArrayDeque`를 스택처럼 사용하는 방식이 더 효율적입니다.

---

## 주요 메서드 비교

| 메서드 | 설명            | Stack    | ArrayDeque    |
| ------ | --------------- | -------- | ------------- |
| 삽입   | 값 넣기         | `push()` | `offerLast()` |
| 제거   | 맨 위 값 꺼내기 | `pop()`  | `pollLast()`  |
| 조회   | 맨 위 값 보기   | `peek()` | `peekLast()`  |

---

## 코드 예시

```java
// Stack 클래스 사용
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.push(2);
stack.pop();
stack.peek();

// ArrayDeque로 스택 구현
Deque<Integer> stackDeque = new ArrayDeque<>();
stackDeque.offerLast(1);
stackDeque.offerLast(2);
stackDeque.pollLast();
stackDeque.peekLast();
```
