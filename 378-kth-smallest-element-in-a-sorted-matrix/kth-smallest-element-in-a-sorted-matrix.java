class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int row=matrix.length;
        int l=matrix[0][0];
        int r=matrix[row-1][row-1];
        while(l<r){
            int mid=l+(r-l)/2;
            int count=0;
            for(int i=0;i<row;i++){
                for(int j=0;j<row;j++){
                    if(matrix[i][j]<=mid) count++;
                }
            }
            if(count<k){
              l=mid+1;
            } 
            else r=mid;
        }
        return l;
    }
}