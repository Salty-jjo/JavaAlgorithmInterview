## [973\. K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin)

### Medium

---

Given an array of `points` where `points[i] = [xi, yi]` represents a point on the **X-Y** plane and an integer `k`, return the `k` closest points to the origin `(0, 0)`.

The distance between two points on the **X-Y** plane is the Euclidean distance (i.e., `√(x1 - x2)2 + (y1 - y2)2`).

You may return the answer in **any order**. The answer is **guaranteed** to be **unique** (except for the order that it is in).

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/03/03/closestplane1.jpg)

```
Input: points = [[1,3],[-2,2]], k = 1
Output: [[-2,2]]
Explanation:
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].
```

**Example 2:**

```
Input: points = [[3,3],[5,-1],[-2,4]], k = 2
Output: [[3,3],[-2,4]]
Explanation: The answer [[-2,4],[3,3]] would also be accepted.
```

**Constraints:**

-   `1 <= k <= points.length <= 104`
-   `-104 <= xi, yi <= 104`

### How to Solve

---

처음 푼 방식은 LinkedList를 이용하는 방식이다. (Timeout.java)

평소 자주 사용하는 ArrayList를 사용하지 않고 LinkedList를 사용한 이유는 중간에 값을 넣어야하기에 배열보다 리스트가 더 효율적이기 때문이다.

하지만 이럴 경우, 값 비교로 인해 n^2만큼의 복잡도를 가진다.

그렇기에 사용한 방식은 PriorityQueue이다.

Distance로 Sort되도록 지정하여 생성하면 값을 Add만 하면 되기에 복잡도가 n이 된다.