## [332\. Reconstruct Itinerary](https://leetcode.com/problems/reconstruct-itinerary)

### Hard

---

You are given a list of airline `tickets` where `tickets[i] = [fromi, toi]` represent the departure and the arrival airports of one flight. Reconstruct the itinerary in order and return it.

All of the tickets belong to a man who departs from `"JFK"`, thus, the itinerary must begin with `"JFK"`. If there are multiple valid itineraries, you should return the itinerary that has the smallest lexical order when read as a single string.

-   For example, the itinerary `["JFK", "LGA"]` has a smaller lexical order than `["JFK", "LGB"]`.

You may assume all tickets form at least one valid itinerary. You must use all the tickets once and only once.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/03/14/itinerary1-graph.jpg)

```
Input: tickets = [["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]
Output: ["JFK","MUC","LHR","SFO","SJC"]
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/03/14/itinerary2-graph.jpg)

```
Input: tickets = [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
Output: ["JFK","ATL","JFK","SFO","ATL","SFO"]
Explanation: Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"] but it is larger in lexical order.
```

**Constraints:**

-   `1 <= tickets.length <= 300`
-   `tickets[i].length == 2`
-   `fromi.length == 3`
-   `toi.length == 3`
-   `fromi` and `toi` consist of uppercase English letters.
-   `fromi != toi`

### How to Solve

---

출발지와 목적지를 저장하는 Map을 우선순위 큐를 이용해 생성한다.

우선순위 큐를 이용하면 사전 어휘순으로 정렬할 수 있게 된다.

그래서 여러 도착지를 어휘순으로 추출하여 스택에 넣어 하나씩 뽑아 추출하게된다.

해당 문제는 다양한 방식으로 풀어보고자 하였지만, 메모리 문제와 시간 문제로 실패하였다.

실패한 코드 모두 첨부한다.