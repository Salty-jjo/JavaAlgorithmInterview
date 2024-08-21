## [23\. Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/)

### Hard

---

You are given an array of `k` linked-lists `lists`, each linked-list is sorted in ascending order.

_Merge all the linked-lists into one sorted linked-list and return it._

**Example 1:**

```
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
```

**Example 2:**

```
Input: lists = []
Output: []
```

**Example 3:**

```
Input: lists = [[]]
Output: []
```

**Constraints:**

-   `k == lists.length`
-   `0 <= k <= 104`
-   `0 <= lists[i].length <= 500`
-   `-104 <= lists[i][j] <= 104`
-   `lists[i]` is sorted in **ascending order**.
-   The sum of `lists[i].length` will not exceed `104`.

### How to Solve

---

이번 문제는 ArrayList에 값을 넣고 Collections 라이브러리를 이용하여 Sort를 하였다.

ArrayList에서 값을 가져오는 함수는 get(index)이다.

값을 ListNode에 넣을 때에는 answer ListNode에 바로 넣지않고 이를 복제한 tail ListNode에 next를 하며 값을 넣었다.

next로 넘어가면 다시 이전 값으로 돌아갈 수 없기 때문에 temp용 tail을 만든 것이다.