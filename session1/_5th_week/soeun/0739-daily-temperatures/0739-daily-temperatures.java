class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int [temperatures.length];
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int last = st.pop();
                answer[last] = i-last;
            }
            st.push(i);
        }

        return answer;
    }
}