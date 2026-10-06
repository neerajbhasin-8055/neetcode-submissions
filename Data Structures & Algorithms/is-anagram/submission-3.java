class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() > t.length() || t.length() > s.length()){
            return false;
        }
        char[] st = s.toCharArray();
        char[] tt = t.toCharArray();
        int[] arr = new int[26];
        for(char ch : st){
            arr[ch - 'a']++;
        }
        for(char ch2 : tt){
            arr[ch2 - 'a']--;
        }
        for(int i = 0 ; i< 26;i++){
            if(arr[i]>0){
                return false;
            }
        }
        return true;
    }
}
