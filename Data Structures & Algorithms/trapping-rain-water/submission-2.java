class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] lb = new int[n];
        int[] rb = new int[n];
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            lb[i] = Math.max(max1, height[i]);
            max1 = Math.max(max1,height[i]);
        }
        for(int i = n-1 ; i >= 0 ; i--){
            rb[i] = Math.max(max2, height[i]);
            max2 = Math.max(max2, height[i]);
        }
        int total = 0;
        for(int i = 0 ; i < n ; i++){
            int min = Math.min(lb[i],rb[i]);
            total += min - height[i];
        }
        return total;
    }
}
