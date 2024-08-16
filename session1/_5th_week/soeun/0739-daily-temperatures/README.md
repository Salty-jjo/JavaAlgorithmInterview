739. Daily Temperatures
Medium
Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]
Constraints:

1 <= temperatures.length <= 105
30 <= temperatures[i] <= 100
How to Solve
첫번째로 작성한 코드에서는 같은 온도가 maximum 수 만큼 있는 최악의 경우에서 Timeout이 발생하였다.

이중 for문으로 인해 복잡도가 높아진 것이 원인이다.

첫 생각은 온도 배열을 처음부터 훑으며 answer배열에 count 수를 넣는 것이었다. 이럴 경우 모두 하나씩 확인하는 것이므로 복잡도가 가장 안좋은 코드라고 할 수 있다.

답안지로 제출에 성공한 코드는 Deque를 사용하였다.

이 Deque는 Index값을 넣어두는데에 사용한다.

현재의 값이 직전에 넣은 값보다 큰 경우 Deque에서 직전에 있던 값을 빼며 현재의 index에서 직전값의 index를 뺀다.

그러면 그 사이에 몇개의 직전온도보다 낮은 온도가 있었는지 알 수 있다.

 자세한 코드는 0739 java file을 확인하면 된다.