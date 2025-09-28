package Day_1;
public class Q3_first_last_brute {
    public static void main(String[] args) {
      int[]  nums = {5,7,7,8,8,10};
      int target = 8;
      int ans [] = new int [2];
      if (nums.length==0) {
        ans[0]=-1;
        ans[1]=-1;
      }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target) {
                ans[0]=i;
                break ;
            }else{
                ans[0]=-1;
            }
        }
        for (int i = nums.length-1; i >=0; i--) {
            if (nums[i]==target) {
                ans[1]=i;
                break;
            }else{
                ans[1]=-1;
            }
        }
        for (int i = 0; i < ans.length; i++) {
             System.out.print(ans[i]+" ");
        }
       
    }
}
