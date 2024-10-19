## [744\. Network Delay Time](https://leetcode.com/problems/network-delay-time)

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

 큐를 이용하여 최소거리를 업데이트 하는 방식으로 진행한다.

1.  초기설정  
    
    ```
    // 1. 초기 세팅
            int[] dist = new int[n];
            for(int i = 0; i < dist.length; i++) {
                dist[i] = Integer.MAX_VALUE;
            }
            // 각 노드와 연결되는 노드의 정보 리스트로 정리
            List<Node>[] nodeList = new List[n];
            for(int i=0; i < nodeList.length; i++){
                nodeList[i] = new ArrayList<>();
            }
            for(int[] time : times){
                nodeList[time[0] - 1].add(new Node(time[1] -1, time[2]));
            }
    
            Queue<Node> queue = new PriorityQueue<>((n1, n2)-> n1.distance - n2.distance);
            queue.offer(new Node(k-1, 0));
            dist[k-1] = 0;
    ```
    
2.  큐 실행: 최소거리 갱신  
    
    ```
    // 2. 큐 실행: 최소거리 갱신
            while(!queue.isEmpty()) {
                Node node = queue.poll();
                int distance = node.distance;
                int nodeId = node.nodeId;
    
                for (int i = 0; i < nodeList[nodeId].size(); i++) {
                    Node curNode = nodeList[nodeId].get(i);
                    int curNodeId = curNode.nodeId;
                    int curNodeDistance = curNode.distance;
                    if (dist[curNodeId] > distance + curNodeDistance) {
                        dist[curNodeId] = distance + curNodeDistance;
                        queue.add(new Node(curNodeId, distance + curNodeDistance));
                    }
                }
            }
    ```
    
3.  최대값 리턴