package Day4;
class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero= 0 ;
        int s = 0;
        int ans = 0 ;
        for(int i =0 ; i< nums.length ; i++){
            if(nums[i]==0){
                zero++;
            }

            while(zero>k){
                if( nums[s]==0){
                    
                    zero--;
                }
                s++;
            }
            
            ans = Math.max(ans , i-s+1);
        }
        return ans ;
    }
}