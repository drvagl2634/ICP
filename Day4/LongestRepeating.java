class Solution {
    public int characterReplacement(String s, int k) {
        int i =0 ;
        int ans =0 ;
        int j = 0;
        int maxfreq =0;
        HashMap <Character , Integer>map = new HashMap<>();
        while(j<s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
            maxfreq= Math.max(maxfreq, map.get(s.charAt(j)));
            while((j-i+1)-maxfreq>k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
        ans = Math.max(ans,j-i+1);
        j++;
        }
        return ans ;

    }
}