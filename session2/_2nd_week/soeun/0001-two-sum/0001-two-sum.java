class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> nMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nMap.containsKey(target - nums[i])) {
                return new int[] {nMap.get(target - nums[i]), i};
            }
            nMap.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}