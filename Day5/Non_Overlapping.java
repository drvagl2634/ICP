import java.util.*;

class Solution {
    public int arr(int[][] arr) {
        if (arr.length == 0) return 0;

        
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;  
        int end = arr[0][1];  

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] < end) {
                
                count++;
            } else {
                
                end = arr[i][1];
            }
        }
        return count;
    }
}
