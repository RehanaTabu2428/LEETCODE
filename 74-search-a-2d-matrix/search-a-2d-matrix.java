class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int l=0;
        int r=rows*cols-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int m=mid/cols;
            int n=mid%cols;
            if(matrix[m][n]==target) return true;
            if(matrix[m][n]<=target){
                l=mid+1;
            } 
            else r=mid-1;
        }
        return false;
    }
}