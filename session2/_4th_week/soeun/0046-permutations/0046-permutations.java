class Solution {
    private void dfs(List<List<Integer>> answer, List<Integer> preElements, List<Integer> elements) {
        if (elements.isEmpty()) {
            answer.add(preElements.stream().collect(Collectors.toList()));
        }

        for (Integer e : elements) {
            List<Integer> nextElements = new ArrayList<>(elements);
            nextElements.remove(e);

            preElements.add(e);
            dfs(answer, preElements, nextElements);
            preElements.remove(e);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        dfs(answer, new ArrayList<>(), list);

        return answer;
    }
}