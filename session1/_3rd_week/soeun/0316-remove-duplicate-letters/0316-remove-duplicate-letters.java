class Solution {
    public String removeDuplicateLetters(String s) {
        char arr[] = s.toCharArray();
        int last[] = new int[26];
        int n = arr.length;
        boolean map[] = new boolean[26];
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            last[arr[i] - 'a'] = i;
        }

        for (int i = 0; i < n; i++){
            int x = answer.length();
            while (x > 0 && !map[arr[i] - 'a'] && answer.charAt(x - 1) > arr[i] && last[answer.charAt(x - 1) - 'a'] > i){
                map[answer.charAt(x - 1) - 'a'] = false;
                answer.deleteCharAt(x - 1);
                x = answer.length();
            }
            if (!map[arr[i] - 'a']) {
                answer.append(arr[i]);
            }
            map[arr[i] - 'a']=true;
        }
        return answer.toString();
    }
}