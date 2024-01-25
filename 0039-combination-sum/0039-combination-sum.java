class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the candidates to handle duplicates and for optimization
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }
    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                // Skip if the current candidate is greater than the target
                break;
            }

            current.add(candidates[i]);
            // Continue the recursion with the same candidate since it can be used multiple times
            backtrack(result, current, candidates, target - candidates[i], i);
            current.remove(current.size() - 1);
        }
    }

}