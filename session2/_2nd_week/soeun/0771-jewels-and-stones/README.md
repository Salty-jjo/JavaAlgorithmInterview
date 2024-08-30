## [771\. Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/)

### Easy

---

You're given strings `jewels` representing the types of stones that are jewels, and `stones` representing the stones you have. Each character in `stones` is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so `"a"` is considered a different type of stone from `"A"`.

**Example 1:**

```
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
```

**Example 2:**

```
Input: jewels = "z", stones = "ZZ"
Output: 0
```

**Constraints:**

-   `1 <= jewels.length, stones.length <= 50`
-   `jewels` and `stones` consist of only English letters.
-   All the characters of `jewels` are **unique**.

### How to Solve

---

해당 문제는 값을 이용하는 문제로 값을 넣어두고 존재하는지 파악해야한다.

그렇기에 HashSet을 이용하는 것이 적절하다.

HashSet은 Set 인터페이스에서 지원하는 구현 클래스이다. 때문에 Set의 성질을 그대로 상속받는 다는 것이 특징이다.  
HashSet은 중복된 값을 허용하지 않는다. 그렇기에  값의 존재 유무를 파악할 때 사용할 수 있다.  
List 등과는 다르게 저장한 순서가 보장되지 않는다는 특징도 있다.  
또한, HashSet은 null을 값으로 허용한다.

하단엔 HashSet과 관련된 함수의 예제가 있다.

```
HashSet<String> h1 = new HashSet<String>();
h1.add("string"); // 값 추가
h1.size() // 크기 확인
h1.remove("string") // 값 제거
h1.clear() // 모든 값 제거
h1.contains("String") // 값 존재 유무
```