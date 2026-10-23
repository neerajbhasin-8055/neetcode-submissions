class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int j = 0 ;
        int longest = 0;
        for(int i = 0 ; i < s.length(); i++){
            while(j < s.length() && !set.contains(s.charAt(j))){
               set.add(s.charAt(j));
               j++;
            }
            longest = Math.max(longest, j-i);
            set.remove(s.charAt(i));
        }
        return longest;
    }
}
