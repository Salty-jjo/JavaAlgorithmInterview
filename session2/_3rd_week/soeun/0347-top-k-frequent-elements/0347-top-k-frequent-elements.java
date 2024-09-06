class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int [k];
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> keySort = new ArrayList<>(map.keySet());
        keySort.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        for (int i = 0; i < k; i++) {
            answer[i] = keySort.get(i);
        }

        return answer;
    }
}