23. Merge k Sorted Lists
Hard
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.



Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
Example 2:

Input: lists = []
Output: []
Example 3:

Input: lists = [[]]
Output: []


Constraints:

k == lists.length
0 <= k <= 104
0 <= lists[i].length <= 500
-104 <= lists[i][j] <= 104
lists[i] is sorted in ascending order.
The sum of lists[i].length will not exceed 104.


How to Solve
배열에 값을 순서대로 넣는 for문 / 배열 정렬 / return 값에 맞는 방식으로 정렬 순으로 코드가 짜여진다.

이런 방식으로 단순하게 풀이하는 것보다 Priority Queue를 이용하는 것이 더 효율적이다.



우선순위 큐(Priority Queue)의 경우 들어가는 순서와는 상관없이 우선순위가 높은 데이터가 먼저 나가는 자료구조이다.



add()

우선순위 큐에 원소를 추가. 큐가 꽉 찬 경우 에러 발생

offer()

우선순위 큐에 원소를 추가. 값 추가 실패 시 false를 반환

poll()

우선순위 큐에서 첫 번째 값을 반환하고  제거, 비어있으면 null 반환

remove()

우선순위 큐에서 첫 번째 값을 반환하고  제거, 비어있으면 에러 발생

isEmpty()

우선순위 큐에서 첫 번째 값을 반환하고  제거, 비어있으면 에러 발생

clear()

우선순위 큐를 초기화

size()

우선순위 큐에 포함되어 있는 원소의 수를 반환

