class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int i = 0 ;
        int max = 0;
        int longest = 0 ;
        for(int j = 0 ; j < s.length() ; j++){
            int ch = s.charAt(j) - 'A';
            freq[ch]++;
            max = Math.max(max,freq[ch]);
            int replacement = j-i+1 - max;
            if(replacement > k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            longest = Math.max(longest,j-i+1);
        }
        return longest;
    }
}
