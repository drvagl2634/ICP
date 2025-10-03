class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        
       Arrays.sort(arr);
       Sum(arr , target , 0 , new ArrayList<>());
       return  ans ; 
    }
    public void Sum(int [] arr , int target , int idx , List<Integer> list){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return ;
        }
        for(int i = idx ; i<arr.length ; i++){
            if(i>idx && arr[i]==arr[i-1]){
                continue ;
            }
            if(target>=arr[i]){
                list.add(arr[i]);
                Sum(arr , target-arr[i] , i+1, new ArrayList<>(list));
                list.remove(list.size()-1);
            }
        }
    }
}