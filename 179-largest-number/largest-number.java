class Solution {
    public String largestNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1-i;j++){
                String one=String.valueOf(nums[j]);
                String two=String.valueOf(nums[j+1]);

                String ab=one+two;
                String ba=two+one;

                if(ba.compareTo(ab)>0){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        if(nums[0]==0) return "0";

        String ans="";
        for(int i=0;i<nums.length;i++){
            ans=ans+nums[i];
        }
        return ans;
    }
}