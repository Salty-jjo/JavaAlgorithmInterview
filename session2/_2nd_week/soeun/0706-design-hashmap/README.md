## [706\. Design HashMap](https://leetcode.com/problems/design-hashmap/)

### Easy

---

Design a HashMap without using any built-in hash table libraries.

Implement the `MyHashMap` class:

-   `MyHashMap()` initializes the object with an empty map.
-   `void put(int key, int value)` inserts a `(key, value)` pair into the HashMap. If the `key` already exists in the map, update the corresponding `value`.
-   `int get(int key)` returns the `value` to which the specified `key` is mapped, or `-1` if this map contains no mapping for the `key`.
-   `void remove(key)` removes the `key` and its corresponding `value` if the map contains the mapping for the `key`.

**Example 1:**

```
Input
["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
[[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
Output
[null, null, null, 1, -1, null, 1, null, -1]

Explanation
MyHashMap myHashMap = new MyHashMap();
myHashMap.put(1, 1); // The map is now [[1,1]]
myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
```

**Constraints:**

-   `0 <= key, value <= 106`
-   At most `104` calls will be made to `put`, `get`, and `remove`.

### How to Solve

---

해당 문제는 HashMap이 무엇인지가 중요한 문제이기에 HashMap에 대한 간단한 정리를 해보겠다.

HashMap이란 컬렉션의 하나로, 데이터를 키(Key)와 밸류(Value)의 짝으로 저장한다.

데이터를 저장할 때는 키(Key) 값으로 해시함수를 실행한 결과를 통해 저장위치를 결정한다.

따라서 HashMap은 특정 데이터의 저장위치를 해시함수를 통해 바로 알 수 있기 때문에 데이터의 추가, 삭제, 특히 검색이 빠르다는 장점이 있다. (이러한 이유로 코딩테스트에서는 없어서는 안될 존재이다)   
  

아래는 데이터 추가 삭제 수정 확인 반환에 대한 코드를 보여주겠다.

```
HashMap<String, String> h1 = new HashMap<String, String>( ); // 선언

// 데이터 추가
h1.put(key, value) // key와 value를 저장
h1.putAll(Map<String, String> m) // Map m의 데이터를 전부 저장 
h1.putIfAbsent(key, value) // 기존 데이터에 key가 없으면  key와 value를 저장 

// 데이터 삭제
h1.clear( ) // 모든 데이터를 삭제
h1.remove(key) // key와 일치하는 기존 데이터(key와 value)를 삭제
h1.remove(key, value) // key와 value가 동시에 일치하는 데이터를 삭제

// 데이터 수정
h1.replace(key, value) // key와 일치하는 기존 데이터의 value를 변경
h1.replace(key, oldValue, newValue) // key와 oldValue가 동시에 일치하는 데이터의 value를 newValue로 변경

// 데이터 확인
h1.containsKey(key) // key와 일치하는 데이터가 있는지 여부를 반환
h1.containsValue(value) // value가 일치하는 데이터가 있는지 여부를 반환
h1.isEmpty( ) // 데이터가 빈 상태인지 여부를 반환
h1.size( ) // key-value 맵핑 데이터의 개수를 반환

// 데이터 반환
h1.get(key) // key와 맵핑된 value값을 반환합니다. 
h1.getOrDefault(key, defaultValue) // key와 맵핑된 value값을 반환하고 없으면 defaultValue값을 반환합니다.
h1.entrySet( ) // 모든 key-value 맵핑 데이터를 가진 Set 데이터를 반환합니다. 
h1.keySet( ) // 모든 key 값을 가진 Set 데이터를 반환합니다. 
h1.values( ) // 모든 value 값을 가진 Collection 데이터를 반환합니다.
```