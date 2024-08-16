232. Implement Queue using Stacks
Easy
Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

void push(int x) Pushes element x to the back of the queue.
int pop() Removes the element from the front of the queue and returns it.
int peek() Returns the element at the front of the queue.
boolean empty() Returns true if the queue is empty, false otherwise.
Notes:

You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.


Example 1:

Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]

Explanation
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false


Constraints:

1 <= x <= 9
At most 100 calls will be made to push, pop, peek, and empty.
All the calls to pop and peek are valid.


Follow-up: Can you implement the queue such that each operation is amortized O(1) time complexity? In other words, performing n operations will take overall O(n) time even if one of those operations may take longer.

How to Solve
해당 문제는 Stack을 이용하여 Queue 함수를 구현하는 것이다.

처음 시도한 Queue로 Stack 구현하는 방식과 같은 방법으로 구현한 코드는 Timeout이 발생하였다.

방식은 Stack에 Input 시 값을 반대로 넣는 방식으로 구현하는 것이었다.

그렇기에 다른 코드의 도움을 받아 두개의 Stack으로 구현해야 Timeout이 발생하지 않는다는 것을 확인하였다.

input과 output 스택을 만들어 말 그대로 Input 시 input 스택에 넣는다.

Output 시 output 스택이 비어있을 경우에 input에 있는 값들을 꺼내어 넣는다.

이럴 경우 값이 가장 마지막에 Input된 값이 가장 먼저 들어오게 된다.

이때 Output이 비어있는 경우에만 하는 이유는 Output 스택에 값이 있을 때 새로운 Input값 (나중에 들어온 값)을 넣게되면 이 값이 먼저 나가게 되므로 Queue의 알고리즘과는 맞지 않게 된다.

Empty인지 아닌지는 Input과 Output이 모두 비어있는게 맞는지 아닌지를 확인해야한다.

자세한 내용은 코드를 확인하면 된다.