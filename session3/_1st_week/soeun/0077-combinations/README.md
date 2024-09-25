## [77\. Combinations](https://leetcode.com/problems/combinations/)

### Medium

---

Given two integers `n` and `k`, return _all possible combinations of_ `k` _numbers chosen from the range_ `[1, n]`.

You may return the answer in **any order**.

**Example 1:**

```
Input: n = 4, k = 2
Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
Explanation: There are 4 choose 2 = 6 total combinations.
Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
```

**Example 2:**

```
Input: n = 1, k = 1
Output: [[1]]
Explanation: There is 1 choose 1 = 1 total combination.
```

**Constraints:**

-   `1 <= n <= 20`
-   `1 <= k <= n`

### How to Solve

---

해당 문제는 n까지의 숫자 중 k개로 이루어진 조합을 찾는 문제이다.

조합 또한 모든 숫자를 확인하며 조합을 만들어야 하기에 dfs 알고리즘을 이용하였다.

일단 조합 리스트 즉, 문자리스트의 리스트를 하나 만들어둔다. 해당 리스트에는 정답으로 들어갈 리스트를 넣는 용도이다.

그리고 그 안에 들어갈 문자 리스트는 값을 하나씩 추가하도록 한다.

값을 추가하는 방식은 아래와 같다.

```
	for (int i = start; i <= n; i++) {
            elements.add(i);
            dfs(results, elements, n, i+1, k-1);
            elements.removeLast();
        }
```

i + 1의 의미: 시작점을 추가한다. 즉, 한번 지나온 값을 다시 add하지 않도록 한다.

k - 1의 의미: 숫자 하나를 넣었으므로 앞으로 넣어야할 숫자가 1개 줄었다는 의미이다.

k가 0이 되면 그 조합은 answer 리스트에 추가되게 된다.