class Solution {
    public boolean isPalindrome(String s) {
        String st = s.toLowerCase().trim();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < st.length(); i++) {
            if (Character.isLetterOrDigit(st.charAt(i))) {
                sb.append(st.charAt(i));
            }
        }
        return check(sb);
    }
    public boolean check(StringBuilder sb){
        int i = 0 ;
        int j = sb.length() -1;
        while(i <= j){
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
