class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxW=0;
        int l =0;
        HashSet<Character> hs = new HashSet<>();
        for (int r=0;r<s.length();r++){
            while(hs.contains(s.charAt(r))){
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(s.charAt(r));
            maxW = Math.max(maxW,r-l+1);
        }
        return maxW;
    }
}