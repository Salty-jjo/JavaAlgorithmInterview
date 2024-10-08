## [743\. Network Delay Time](https://leetcode.com/problems/network-delay-time/)

### Medium

---

You are given a network of `n` nodes, labeled from `1` to `n`. You are also given `times`, a list of travel times as directed edges `times[i] = (ui, vi, wi)`, where `ui` is the source node, `vi` is the target node, and `wi` is the time it takes for a signal to travel from source to target.

We will send a signal from a given node `k`. Return _the **minimum** time it takes for all the_ `n` _nodes to receive the signal_. If it is impossible for all the `n` nodes to receive the signal, return `-1`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2019/05/23/931_example_1.png)

```
Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
Output: 2
```

**Example 2:**

```
Input: times = [[1,2,1]], n = 2, k = 1
Output: 1
```

**Example 3:**

```
Input: times = [[1,2,1]], n = 2, k = 2
Output: -1
```

**Constraints:**

-   `1 <= k <= n <= 100`
-   `1 <= times.length <= 6000`
-   `times[i].length == 3`
-   `1 <= ui, vi <= n`
-   `ui != vi`
-   `0 <= wi <= 100`
-   All the pairs `(ui, vi)` are **unique**. (i.e., no multiple edges.)

### How to Solve

---

해당 문제는 최단거리 알고리즘 다익스트라 알고리즘을 이용하면 바로 해결할 수 있다.

다익스트라(dijkstra) 알고리즘은 그래프에서 한 정점(노드)에서 다른 정점까지의 최단 경로를 구하는 알고리즘 중 하나이다.

이 과정에서 도착 정점 뿐만 아니라 모든 다른 정점까지 최단 경로로 방문하며 각 정점까지의 최단 경로를 모두 찾게 된다.

매번 최단 경로의 정점을 선택해 탐색을 반복하는 것이다.

참고로 그래프 알고리즘 중 최소 비용을 구하는 데는 다익스트라 알고리즘 외에도 벨만-포드 알고리즘, 프로이드 워샬 알고리즘 등이 있다.

다익스트라 구현 순서는 아래와 같다.

1.  루프를 돌려 이웃 노드를 방문하고 거리를 계산
2.  첫 루프 이후의 그래프의 상태가 업데이트되는 방식
3.  더 빠른 경로를 발견한 경우 값 업데이트

다익스트라의 특징을 아래와 같다.

장점

-   인접 행렬 또는 우선순위 대기열을 사용하여 구현할 수 있으므로 가능한 모든 경로를 확인하는 무차별 접근 방식보다 효율적이다.
-   거리뿐만 아니라 경로를 추적하도록 알고리즘을 쉽게 수정할 수 있다.

단점

-   우선순위 대기열을 사용할 때 간선이 많은 큰 그래프의 경우 느려질 수 있다.
-   그래프와 거리를 저장하려면 많은 양의 메모리가 필요하다.
-   동일한 거리에 여러 경로가 있는 경우 최상의 경로를 보장하지 않는다.
-   지형이나 교통 상황과 같은 다른 요소는 고려하지 않는다.