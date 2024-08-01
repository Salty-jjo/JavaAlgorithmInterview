## [316\. Remove Duplicate Letters](https://leetcode.com/problems/remove-duplicate-letters/)

### Medium

---

Given a string `s`, remove duplicate letters so that every letter appears once and only once. You must make sure your result is **the smallest in lexicographical order** among all possible results.

**Example 1:**

```
Input: s = "bcabc"
Output: "abc"
```

**Example 2:**

```
Input: s = "cbacdcbc"
Output: "acdb"
```

**Constraints:**

-   `1 <= s.length <= 104`
-   `s` consists of lowercase English letters.

**Note:** This question is the same as 1081: [https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/](https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/)

### How to Solve

---

해당 문제에 대해서는 배열을 사용함

 중복되는 글자가 들어올 경우 맨 뒤에 있는 것과 원래 있던 String을 비교하여 더 앞에 있는 문자로 지정한다.

해당 문제는 배열이 아닌 Deque를 이용하는 것이 책에 나온 방법이지만 다음과 같이 배열을 만들어 비교하는 것이 더 효율적이다.