## [17\. Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)

### Medium

---

Given a string containing digits from `2-9` inclusive, return all possible letter combinations that the number could represent. Return the answer in **any order**.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

![](https://assets.leetcode.com/uploads/2022/03/15/1200px-telephone-keypad2svg.png)

**Example 1:**

```
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
```

**Example 2:**

```
Input: digits = ""
Output: []
```

**Example 3:**

```
Input: digits = "2"
Output: ["a","b","c"]
```

**Constraints:**

-   `0 <= digits.length <= 4`
-   `digits[i]` is a digit in the range `['2', '9']`.

### How to Solve

---

해당 문제는 번호에 대한 Character가 정해져 있다.

그렇기에 이 부분은 키, 값 형태의 Map으로 지정해두었다.

모든 조합을 찹는 부분을 찾을 때 중요한 것은 "모든"이라는 단어이다.

이 경우에는 DFS 알고리즘을 먼저 찾으면 된다.

해당 알고리즘이 무엇인지는 이전에 설명하였으므로 생략한다.

현재 있는 값에서 모든 문자열을 각각의 자리에 추가하는 방식으로 문제를 해결하였다.