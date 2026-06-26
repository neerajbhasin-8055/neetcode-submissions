class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        Set<Character> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int left = 0;
        for(int right = 0 ; right < s.length(); right++){
            
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
            }
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}
