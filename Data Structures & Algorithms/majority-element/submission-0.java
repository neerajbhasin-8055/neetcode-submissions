class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int val = 1 ;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] != candidate){
                val --;
                if(val == 0 ){
                    candidate = nums[i];
                    val++;
                }
            }else{
                val++;
            }
        }
        return candidate;
    }
}