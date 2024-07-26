## [42\. Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)

### Hard

---

Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

**Example 1:**

![](https://assets.leetcode.com/uploads/2018/10/22/rainwatertrap.png)

```
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
```

**Example 2:**

```
Input: height = [4,2,0,3,2,5]
Output: 9
```

**Constraints:**

-   `n == height.length`
-   `1 <= n <= 2 * 104`
-   `0 <= height[i] <= 105`

### **How to Solve**

---

**Two Pointer**를 이용한 풀이로 작성함

포인트는 양 끝에서부터 점차 가운데로 온다 이때 오른쪽이 높으면 왼쪽에서 +1 왼쪽이 높다면 오른쪽에서 -1 로 하여 한칸씩 이동한다.

해당 방식으로 진행하면 O(n)의 복잡도를 가지게 된다.

시간복잡도  `O(n^2)` 의 코드로는 아래의 코드를 볼 수 있다.

```
        int leftMax = height[0];
        for (int i = 1; i < height.length - 1; i++) {
            int rightMax = 0;
            for (int j = i + 1; j < height.length; j++) {
                if (rightMax < height[j]) {
                    rightMax = height[j];
                }
            }
            int minVal = Math.min(leftMax, rightMax);
            if (height[i] < minVal) {
                answer += (minVal - height[i]);
            }
            if (height[i] > leftMax) {
                leftMax = height[i];
            }
        }
```