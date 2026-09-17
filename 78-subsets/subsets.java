class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> empty = new ArrayList<>();
        ans.add(empty);

        for(int i=0;i<nums.length;i++){
            int size=ans.size();

            for(int j=0;j<size;j++){
                List<Integer> newsub = new ArrayList<>(ans.get(j));
                newsub.add(nums[i]);
                ans.add(newsub);
            }
        }
        return ans; 
    }
}