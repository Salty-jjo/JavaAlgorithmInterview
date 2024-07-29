class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        Map<Character, Character> table = new HashMap<>() {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};
        for (int i = 0; i < s.length(); i++) {
            if (!table.containsKey(s.charAt(i))) {
                st.push(s.charAt(i));
            } else if (st.isEmpty() || table.get(s.charAt(i)) != st.pop()) {
                return false;
            }
        }
        return st.isEmpty();
    }
}