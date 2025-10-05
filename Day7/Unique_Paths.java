class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]= new int[m][n];
        // Arrays.fill(dp,-1);
         for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return paths(m,n,0,0,dp);
    }
    public static int paths(int m , int n, int cr , int cc,int[] [] dp) {
        if(cr<0 ||cr>m-1||cc<0||cc>n-1){
            return 0 ;
        }
        if(cr==m-1&&cc==n-1){
            return 1 ;
        }
        if(dp[cr][cc]!=-1){
            return dp[cr][cc];
        }
        int down= paths(m , n, cr+1,cc,dp);
        int right= paths(m , n, cr,cc+1,dp);
        dp[cr][cc]= down+right;
        return dp[cr][cc] ;
    }

}