class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int j = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            while( j < nums.length && j-i <= k ){
                if(set.contains(nums[j]) && Math.abs(i-j) <= k ){
                    return true;
                }
                set.add(nums[j]);
                j++;
            }
            set.remove(nums[i]);
        }
        return false;
    }
}