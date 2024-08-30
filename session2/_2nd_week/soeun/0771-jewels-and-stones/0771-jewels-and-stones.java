class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet<Character> hashSet = new HashSet<>();

        for (char jewel : jewels.toCharArray()) {
            hashSet.add(jewel);
        }

        for (char stone : stones.toCharArray()) {
            if (hashSet.contains(stone)) {
                count++;
            }
        }

        return count;
    }
}