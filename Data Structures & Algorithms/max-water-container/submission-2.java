class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i = 0 ;
        int j = n - 1;
        int max = 0;
        while( i < j){
            int total = Math.min(heights[i],heights[j]) * (j - i);
            if( heights[i] > heights[j]){
                j--;
            }else{
                i++;
            }
            max = Math.max(max,total);
        }
        return max;
    }
}
