## [20\. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)

### Easy

---

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

1.  Open brackets must be closed by the same type of brackets.
2.  Open brackets must be closed in the correct order.
3.  Every close bracket has a corresponding open bracket of the same type.

**Example 1:**

```
Input: s = "()"
Output: true
```

**Example 2:**

```
Input: s = "()[]{}"
Output: true
```

**Example 3:**

```
Input: s = "(]"
Output: false
```

**Constraints:**

-   `1 <= s.length <= 104`
-   `s` consists of parentheses only `'()[]{}'`.

### How to Solve

---

**스택을 이용**

스택은 가장 나중에 삽입된 엘리먼트가 가장 먼저 처리되는 후입선출(Last In First Out)로 처리되는 추상 자료형이다.

스택은 바구니에 하나씩 물건을 쌓는다고 예시를 많이 든다.

가장 마지막(가장 위)에 있는 것을 가장 먼저 꺼낼 수 있기 때문이다.

**스택 관련 간단한 함수 정리**

```
Stack<Integer> st = new Stack<>();

st.push(1); // stack에 값을 삽입
st.push(2);
st.push(3);
st.push(4);
st.push(5);

system.out.println(st.peek()); // 가장 위에 있는 값(마지막에 넣은 값)을 리턴한다. 출력값: 5
system.out.println(st.pop()); // 가장 위에 있는 값을 빼면서 동시에 리턴한다. 출력값: 5
system.out.println(st.pop()); // 출력값: 4
system.out.println(st.size()); // stack에 있는 값의 수를 리턴한다. 출력값: 3
```

**문제에 대한 이해**

세종류의 괄호가 제대로 열고 닫히는지 판별하는 문제

(), {}, \[\] 세가지 종류가 있다.

괄호가 잘 열고 닫히는지 확인하는 법은 1) 닫히는 괄호가 나왔을 때 기준 가장 마지막에 열린 괄호와 쌍이여야 하고, 2) 마지막에 남아있는 괄호가 없어야한다.

가장 마지막에 들어간 값과 현재의 값이 어우러져야하기 때문에 스택의 전형적인 문제이다.

문제 풀이법은 같이 올라온 파일을 보면 된다.

first.java는 첫 풀이법으로 if문을 통해 하나씩 쌍을 이루는지 비교하였다.

해당 풀이법 대신 **Map**을 사용하면 시간복잡도는 같지만 코드의 중복을 줄일 수 있다.

자세한 코드는 풀이를 확인하면 된다.