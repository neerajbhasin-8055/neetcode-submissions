class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        
        for(int i = 0 ; i < n ; i++ ){
            prefix[i] = 1;
            suffix[i] = 1;
        }
        // Prefix Array 
        for(int j = n-2; j >= 0 ; j--){
            prefix[j] = prefix[j+1] * nums[j+1];
        }

        // suffix Array 
        for(int k = 1 ; k < n ; k++){
            suffix[k] = suffix[k-1] * nums[k-1];
        }

        int[] result = new int[n];
        for(int l = 0 ; l < n ; l++){
            result[l] = prefix[l] * suffix[l];
        }
        return result;
    }
}  
