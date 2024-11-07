## [787\. Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/)

### Medium

---

There are `n` cities connected by some number of flights. You are given an array `flights` where `flights[i] = [fromi, toi, pricei]` indicates that there is a flight from city `fromi` to city `toi` with cost `pricei`.

You are also given three integers `src`, `dst`, and `k`, return _**the cheapest price** from_ `src` _to_ `dst` _with at most_ `k` _stops._ If there is no such route, return `-1`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/03/18/cheapest-flights-within-k-stops-3drawio.png)

```
Input: n = 4, flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0, dst = 3, k = 1
Output: 700
Explanation:
The graph is shown above.
The optimal path with at most 1 stop from city 0 to 3 is marked in red and has cost 100 + 600 = 700.
Note that the path through cities [0,1,2,3] is cheaper but is invalid because it uses 2 stops.
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/03/18/cheapest-flights-within-k-stops-1drawio.png)

```
Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1
Output: 200
Explanation:
The graph is shown above.
The optimal path with at most 1 stop from city 0 to 2 is marked in red and has cost 100 + 100 = 200.
```

**Example 3:**

![](https://assets.leetcode.com/uploads/2022/03/18/cheapest-flights-within-k-stops-2drawio.png)

```
Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 0
Output: 500
Explanation:
The graph is shown above.
The optimal path with no stops from city 0 to 2 is marked in red and has cost 500.
```

**Constraints:**

-   `1 <= n <= 100`
-   `0 <= flights.length <= (n * (n - 1) / 2)`
-   `flights[i].length == 3`
-   `0 <= fromi, toi < n`
-   `fromi != toi`
-   `1 <= pricei <= 104`
-   There will not be any multiple flights between two cities.
-   `0 <= src, dst, k < n`
-   `src != dst`

### How to Solve

---

해당 문제에서는 너비 우선 탐색 (BFS)를 이용하였다.

**너비 우선 탐색이란**  
루트 노드(혹은 다른 임의의 노드)에서 시작해서 인접한 노드를 먼저 탐색하는 방법이다.  
  
시작 정점으로부터 가까운 정점을 먼저 방문하고 멀리 떨어져 있는 정점을 나중에 방문하는 순회 방법이다.  
즉, 깊게(deep) 탐색하기 전에 넓게(wide) 탐색하는 것이다.  
사용하는 경우: 두 노드 사이의 최단 경로 혹은 임의의 경로를 찾고 싶을 때 이 방법을 선택한다.  
너비 우선 탐색(BFS)이 깊이 우선 탐색(DFS)보다 좀 더 복잡하다.

**너비 우선 탐색(BFS)의 특징**  
\- 직관적이지 않은 면이 있다.  
\- BFS는 시작 노드에서 시작해서 거리에 따라 단계별로 탐색한다고 볼 수 있다.  
\- BFS는 재귀적으로 동작하지 않는다.

BFS는 방문한 노드들을 차례로 저장한 후 꺼낼 수 있는 자료 구조인 큐(Queue)를 사용한다.  
일반적으로 큐를 이용해서 반복적 형태로 구현하는 것이 가장 잘 동작한다.  
해당 문제에서 또한 큐를 이용하여 구현하였다.