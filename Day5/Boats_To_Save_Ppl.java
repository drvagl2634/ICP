class Solution {
    public int numRescueBoats(int[] arr, int k) {
        Arrays.sort(arr);
        int s= 0 ;
        int e= arr.length-1 ;
        int boat=0 ;
        while(s<=e){
            if(arr[s]+arr[e]<=k){
                
                s++;
                
            }
            e--;
            boat++;
        }
        return boat ;
    }
}