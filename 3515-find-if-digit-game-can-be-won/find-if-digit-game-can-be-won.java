class Solution {
    public boolean canAliceWin(int[] nums) {
        int single=0;
        int doubl=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10) single=single+nums[i];
            else doubl=doubl+nums[i];
        }
        return single!=doubl;
    }
}