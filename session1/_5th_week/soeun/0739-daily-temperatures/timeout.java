class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int [temperatures.length];
        boolean[] flag = new boolean [temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i + 1; j < temperatures.length; j++) {
                if (flag[i]) {
                    break;
                }
                if (temperatures[i] < temperatures[j]) {
                    flag[i] = true;
                }
                answer[i]++;
            }
            if (!flag[i]) {
                answer[i] = 0;
            }
        }

        return answer;
    }
}
