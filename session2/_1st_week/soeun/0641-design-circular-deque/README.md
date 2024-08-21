## [641\. Design Circular Deque](https://leetcode.com/problems/design-circular-deque/)

### Medium

---

Design your implementation of the circular double-ended queue (deque).

Implement the `MyCircularDeque` class:

-   `MyCircularDeque(int k)` Initializes the deque with a maximum size of `k`.
-   `boolean insertFront()` Adds an item at the front of Deque. Returns `true` if the operation is successful, or `false` otherwise.
-   `boolean insertLast()` Adds an item at the rear of Deque. Returns `true` if the operation is successful, or `false` otherwise.
-   `boolean deleteFront()` Deletes an item from the front of Deque. Returns `true` if the operation is successful, or `false` otherwise.
-   `boolean deleteLast()` Deletes an item from the rear of Deque. Returns `true` if the operation is successful, or `false` otherwise.
-   `int getFront()` Returns the front item from the Deque. Returns `-1` if the deque is empty.
-   `int getRear()` Returns the last item from Deque. Returns `-1` if the deque is empty.
-   `boolean isEmpty()` Returns `true` if the deque is empty, or `false` otherwise.
-   `boolean isFull()` Returns `true` if the deque is full, or `false` otherwise.

**Example 1:**

```
Input
["MyCircularDeque", "insertLast", "insertLast", "insertFront", "insertFront", "getRear", "isFull", "deleteLast", "insertFront", "getFront"]
[[3], [1], [2], [3], [4], [], [], [], [4], []]
Output
[null, true, true, true, false, 2, true, true, true, 4]

Explanation
MyCircularDeque myCircularDeque = new MyCircularDeque(3);
myCircularDeque.insertLast(1);  // return True
myCircularDeque.insertLast(2);  // return True
myCircularDeque.insertFront(3); // return True
myCircularDeque.insertFront(4); // return False, the queue is full.
myCircularDeque.getRear();      // return 2
myCircularDeque.isFull();       // return True
myCircularDeque.deleteLast();   // return True
myCircularDeque.insertFront(4); // return True
myCircularDeque.getFront();     // return 4
```

**Constraints:**

-   `1 <= k <= 1000`
-   `0 <= value <= 1000`
-   At most `2000` calls will be made to `insertFront`, `insertLast`, `deleteFront`, `deleteLast`, `getFront`, `getRear`, `isEmpty`, `isFull`.

### How to Solve

---

Deque는 Stack + Queue의 자료구조라고 생각할 수 있다. 앞으로도 뒤로도 Add, Remover가 쉽다는 장점이 있다.

Dequq를 이용할 때의 명령어를 아래에 정리해두겠다.

-   **addFirst()**: 덱의 앞쪽에 엘리먼트를 삽입한다. 용량 제한이 있는 덱의 경우, 용량을 초과하면 예외(Exception)가 발생한다
-   **offerFirst()**: 덱의 앞쪽에 엘리먼트를 삽입한다. 정상적으로 엘리먼트가 삽입된 경우 true가 리턴되며, 용량 제한에 걸리는 경우 false를 리턴한다. 
-   **addLast()**: 덱의 마지막 쪽에 엘리먼트를 삽입한다. 용량 제한이 있는 덱의 경우, 용량 초과시 예외가 발생한다
-   **add()**: addLast()와 동일
-   **offerLast()**: 덱의 마지막 쪽에 엘리먼트를 삽입한다. 정상적으로 엘리먼트가 삽입된 경우 true가 리턴되며, 용량 제한에 걸리는 경우 false를 리턴한다. 
-   **removeFirst()**: 덱의 앞쪽에서 엘리먼트 하나를 뽑아서 제거한 다음 해당 엘리먼트를 리턴한다. 덱이 비어있으면 예외가 발생한다. 
-   **pollFirst()**: 덱의 앞쪽에서 엘리먼트 하나를 뽑아서 제거한 다음 해당 엘리먼트를 리턴한다. 덱이 비어있으면 null 이 리턴된다. 
-   **removeLast()**: 덱의 마지막 쪽에서 엘리먼트 하나를 뽑아서 제거한 다음 해당 엘리먼트를 리턴한다. 덱이 비어있으면 예외가 발생한다. 
-   **pollLast()**: 덱의 마지막 쪽에서 엘리먼트 하나를 뽑아서 제거한 다음 해당 엘리먼트를 리턴한다. 덱이 비어있으면 null 이 리턴된다. 
-   **remove()**: removeFirst()와 동일
-   **poll()**: pollFirst()와 동일
-   **getFirst()**: 덱의 앞쪽 엘리먼트 하나를 제거하지 않은채 리턴한다. 덱이 비어있으면 예외가 발생한다
-   **peekFirst()**: 덱의 앞쪽 엘리먼트 하나를 제거하지 않은채 리턴한다. 덱이 비어있으면 null이 리턴된다. 
-   **getLast()**: 덱의 마지막쪽 엘리먼트 하나를 제거하지 않은채 리턴한다. 덱이 비어있으면 예외가 발생한다. 
-   **peekLast()**: 덱의 마지막 엘리먼트 하나를 제거하지 않은 채 리턴한다. 덱이 비어있으면 null이 리턴된다. 
-   **peek()**: peekFirst()와 동일
-   **removeFirstOccurrence(Object o)**: 덱의 앞쪽에서부터 탐색하여 입력한 Object o와 동일한 첫 엘리먼트를 제거한다. Object o 와 같은 엘리먼트가 없으면 덱에 변경이 발생하지 않는다. 
-   **removeLastOccurrence(Object o)**: 덱의 뒤쪽에서부터 탐색하여 입력한 Object o와 동일한 첫 엘리먼트를 제거한다. Object o 와 같은 엘리먼트가 없으면 덱에 변경이 발생하지 않는다. 
-   **element()**: removeFirst()와 동일
-   **addAll(Collection <? extends E c)**: 입력 받은 Collection의 모든 데이터를 덱의 뒤쪽에 삽입한다.
-   **push()**: addFirst()와 동일. 덱을 스택으로 사용할 때 쓰임
-   **pop()**: removeFirst()와 동일. 덱을 스택으로 사용할 때 쓰임
-   **remove(Object o)**: removeFirstOccurrence(Object o)와 동일
-   **contain(Object o)**: 덱에 Object o와 동일한 엘리먼트가 포함되어 있는지 확인
-   **size()**: 덱의 크기 
-   **iterator()**: 덱의 앞쪽부터 순차적으로 실행되는 이터레이터(iterator)를 얻어옴
-   **descendingIterator()**: 덱의 뒤쪽부터 순차적으로 실행되는 이터레이터(iterator)를 얻어옴