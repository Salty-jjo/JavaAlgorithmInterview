## [46\. Permutations](https://leetcode.com/problems/permutations/)

### Medium

---

Given an array `nums` of distinct integers, return _all the possible permutations_. You can return the answer in **any order**.

**Example 1:**

```
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
```

**Example 2:**

```
Input: nums = [0,1]
Output: [[0,1],[1,0]]
```

**Example 3:**

```
Input: nums = [1]
Output: [[1]]
```

**Constraints:**

-   `1 <= nums.length <= 6`
-   `-10 <= nums[i] <= 10`
-   All the integers of `nums` are **unique**.

### How to Solve

---

해당 문제는 각 숫자에 대한 모든 조합을 찾는 문제이다.

"모든" 이라는 단어가 나오면 DFS 알고리즘을 먼저 생각하여 푼다.

DFS 알고리즘에 대한 설명은 이전에 했으므로 그 부분은 생략하겠다.