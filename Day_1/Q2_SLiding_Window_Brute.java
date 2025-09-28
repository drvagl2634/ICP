package Day_1;
public class Q2_SLiding_Window_Brute {
    public static void main(String[] args) {
        int arr [] ={1,3,-1,-3,5,3,6,7};
        int k = 3 ;
        // int a = 0 ;
        int ans [] = new int [arr.length-k+1];
        for (int i = 0; i < arr.length-k+1; i++) {
            int max = Integer.MIN_VALUE ;
            for (int j = i; j < i+k; j++) {
                max = Math.max(max,arr[j]);
            }
            ans[i]= max ;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+ " ");
        }

    }
}
