## [39\. Combination Sum](https://leetcode.com/problems/combination-sum/)

### Medium

---

Given an array of **distinct** integers `candidates` and a target integer `target`, return _a list of all **unique combinations** of_ `candidates` _where the chosen numbers sum to_ `target`_._ You may return the combinations in **any order**.

The **same** number may be chosen from `candidates` an **unlimited number of times**. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to `target` is less than `150` combinations for the given input.

**Example 1:**

```
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
```

**Example 2:**

```
Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
```

**Example 3:**

```
Input: candidates = [2], target = 1
Output: []
```

**Constraints:**

-   `1 <= candidates.length <= 30`
-   `2 <= candidates[i] <= 40`
-   All elements of `candidates` are **distinct**.
-   `1 <= target <= 40`

### How to Solve

---

해당 문제는 합이 target과 같은 조합을 찾는 문제이다.

조합 또한 모든 숫자를 확인하며 조합을 만들어야 하기에 dfs 알고리즘을 이용하였다.

코드 설명을 하자면,

```
        for (int i = index; i < candidates.length; i++) {
            path.add(candidates[i]);
            dfs(results, candidates, target - candidates[i], i, path);
            path.removeLast();
        }
```

path는 여기에서 조합이 들어있는 데크이다.

path에 candidates에 있는 값을 하나씩 넣고 빼는 역할이다. (같은 것은 넣지 못하도록 for 문으로 앞에서부터 진행)

target에서 list에 넣는 값 만큼을 빼며 다음 dfs로 넘긴다.

dfs함수 초반에서는 target값을 이용하여 list에 넣을지 넣지 않을지 확인한다.

```
        if (target < 0) {
            return;
        }
        
        if (target == 0) {
            results.add(new ArrayList(path));
            return;
        }
```