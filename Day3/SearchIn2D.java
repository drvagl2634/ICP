class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lo= 0 ;
        int m = matrix.length ;
        int n = matrix[0].length ;
        int hi= (m*n)-1;
        while(lo<=hi){
            int mid  =(lo+hi)/2;
            int r = mid/n;
            int c = mid%n;
            if(matrix[r][c]==target){
                return true ;
            }
            else if (matrix[r][c]<target){
                lo=mid+1;
            }
            else{
                hi = mid-1;
            }

        }
        return false ;

    }
}