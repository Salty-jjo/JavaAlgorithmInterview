## [200\. Number of Islands](https://leetcode.com/problems/number-of-islands)

### Medium

---

Given an `m x n` 2D binary grid `grid` which represents a map of `'1'`s (land) and `'0'`s (water), return _the number of islands_.

An **island** is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

**Example 1:**

```
Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
```

**Example 2:**

```
Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
```

**Constraints:**

-   `m == grid.length`
-   `n == grid[i].length`
-   `1 <= m, n <= 300`
-   `grid[i][j]` is `'0'` or `'1'`.

### How to Solve

---

**그리디 알고리즘(탐욕법, Greedy Algorithm) 이란**  
\- 최적의 값을 구해야 하는 상황에서 사용되는 근시안적인 방법론으로 ‘각 단계에서 최적이라고 생각되는 것을 선택’ 해 나가는 방식으로 진행하여 최종적인 해답에 도달하는 알고리즘  
\- 이때, 항상 최적의 값을 보장하는것이 아니라 최적의 값의 ‘근사한 값’을 목표로 함  
\- 주로 문제를 분할 가능한 문제들로 분할한 뒤, 각 문제들에 대한 최적해를 구한 뒤 이를 결합하여 전체 문제의 최적해를 구하는 경우에 주로 사용

해당 문제는 1의 상하좌우를 확인하여 1이 모여있는 것을 확인하고 주변에 1이 없다면 그 덩어리까지를 1로 보는 문제이다.

모든 값을 확인해야하기에 그리디 알고리즘 중 하나인 dfs (깊이 우선 탐색)으로 문제를 해결해보았다.

**깊이 우선 탐색(DFS, Depth-First Search)이란**  
\- 루트 노드(혹은 다른 임의의 노드)에서 시작해서 다음 분기(branch)로 넘어가기 전에 해당 분기를 완벽하게 탐색하는 방법  
\- 넓게(wide) 탐색하기 전에 깊게(deep) 탐색하는 것이다.  
\- 사용하는 경우: 모든 노드를 방문 하고자 하는 경우에 이 방법을 선택한다.  
\- 깊이 우선 탐색(DFS)이 너비 우선 탐색(BFS)보다 좀 더 간단하다.  
\- 단순 검색 속도 자체는 너비 우선 탐색(BFS)에 비해서 느리다.