class Solution {
    public int rob(int[] nums) {
    int [] dp = new int[nums.length];
    Arrays.fill(dp ,-1);
    return RobberTD(nums,0,dp);
    }
    public static int RobberTD(int []nums ,int i,int [ ] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob = nums[i]+ RobberTD(nums, i+2,dp);
        int dont_rob = RobberTD(nums, i+1,dp);
        return dp[i]= Math.max(rob,dont_rob);
    }
    
}