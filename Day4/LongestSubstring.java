class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> ch = new HashSet<>();
        int l = 0 ;
        int ans = 0 ;
        for(int r=0 ; r< s.length() ; r++){
            while(ch.contains(s.charAt(r))){
                ch.remove(s.charAt(l));
                l++;
            }
            ch.add(s.charAt(r));
            ans=Math.max(ans, r-l+1);
        }
        return ans;
    }
}