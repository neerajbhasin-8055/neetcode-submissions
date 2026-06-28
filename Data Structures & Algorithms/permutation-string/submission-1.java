class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int freq[] = new int[26];
        for(int i = 0;i<n ;i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int right = 0 ;right <= m-n ; right++ ){
            int[] freq2 = new int[26];
            for(int j = right; j<right+n;j++){
                freq2[s2.charAt(j)-'a']++;
            }
            if(Arrays.equals(freq ,freq2)){
                return true;
            }
        }
        return false;
    }
}
