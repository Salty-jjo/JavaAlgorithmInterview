## [1\. Two Sum](https://leetcode.com/problems/two-sum)

### Easy

---

Given an array of integers `nums` and an integer `target`, return _indices of the two numbers such that they add up to `target`_.

You may assume that each input would have **_exactly_ one solution**, and you may not use the _same_ element twice.

You can return the answer in any order.

**Example 1:**

```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

**Example 2:**

```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

**Example 3:**

```
Input: nums = [3,3], target = 6
Output: [0,1]
```

**Constraints:**

-   `2 <= nums.length <= 104`
-   `-109 <= nums[i] <= 109`
-   `-109 <= target <= 109`
-   **Only one valid answer exists.**

**Follow-up:** Can you come up with an algorithm that is less than `O(n2)` time complexity?

### **How To Solve It**

---

HashMap을 이용한 문제 풀이 (Index, Value)의 형태로 Map 생성하여 시간복잡도를 O(n)으로 만듦

**가장 직관적으로 생각되는 풀이**

```
for (int i = 0; i < nums.length; i++) {
   for (int j = i + 1; j < nums.length; j++) {
    	if (nums[i] + nums[j] == target)
           return new int[] {i, j};
        }
    }
}
```

해당 풀이는 시간복잡도가 `O(n2)` 으로 가장 비용이 많이 드는 방식

그렇기에 HashMap을 통한 비교 탐색을 진행