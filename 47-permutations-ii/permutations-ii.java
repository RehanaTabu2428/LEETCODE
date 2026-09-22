class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> answer = new ArrayList<>();

        Arrays.sort(nums);

        boolean[] used = new boolean[nums.length];

        List<Integer> current = new ArrayList<>();

        backtrack(nums, used, current, answer);

        return answer;
    }

    public void backtrack(int[] nums,
                           boolean[] used,
                           List<Integer> current,
                           List<List<Integer>> answer) {

        // Complete permutation
        if (current.size() == nums.length) {
            answer.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Already used
            if (used[i]) {
                continue;
            }

            // Skip duplicate choice at the same level
            if (i > 0 &&
                nums[i] == nums[i - 1] &&
                !used[i - 1]) {
                continue;
            }

            // CHOOSE
            current.add(nums[i]);
            used[i] = true;

            // EXPLORE
            backtrack(nums, used, current, answer);

            // UNDO
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}