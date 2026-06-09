class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans= new ArrayList<>();
        boolean[] arr= new boolean[candies.length];
        int max=0;
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max) arr[i]=true;
            else arr[i]=false;
        }
        for(boolean v:arr){
            ans.add(v);
        }
        return ans;
    }
}