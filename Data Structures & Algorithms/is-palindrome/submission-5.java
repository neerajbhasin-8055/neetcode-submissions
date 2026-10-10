class Solution {
    public boolean isPalindrome(String s) {
        String st = s.toLowerCase().trim();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ' '  || !Character.isLetterOrDigit(st.charAt(i))) {
                continue;
            }
            sb.append(st.charAt(i));
        }
        // System.out.println(sb.toString());
        return isPal(sb);
    }

    public boolean isPal(StringBuilder sb){
        String t = sb.toString();
        int i = 0 ; 
        int j = t.length()-1;
        while( i <= j){
            if(t.charAt(i) != t.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
