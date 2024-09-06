## [347\. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements)

### Medium

---

Given an integer array `nums` and an integer `k`, return _the_ `k` _most frequent elements_. You may return the answer in **any order**.

**Example 1:**

```
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
```

**Example 2:**

```
Input: nums = [1], k = 1
Output: [1]
```

**Constraints:**

-   `1 <= nums.length <= 105`
-   `-104 <= nums[i] <= 104`
-   `k` is in the range `[1, the number of unique elements in the array]`.
-   It is **guaranteed** that the answer is **unique**.

**Follow up:** Your algorithm's time complexity must be better than `O(n log n)`, where n is the array's size.

### How to Solve

---

빈도수 순으로 k개 만큼 추출하는 알고리즘

일단 (들어온 값, 갯수)로 Map을 만든다.

```
map.put(num, map.getOrDefault(num, 0) + 1);
```

다음과 같은 방식으로 Put을 했다.

이는 Map에 해당 값(num)이 있을 경우 그 값 +1을 진행하고 없는 경우 (Default) 0+1을 한다는 뜻이다.

이렇게 Map에 저장한것을 Sort해준다. (Key값을 기준으로 sort진행)

```
 keySort.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
```

이는 내림차순으로 Sort를 하는 방식이다.

이후 keySort의 Index 0부터 k개 만큼 값을 return하면 된다.