class Solution {
    public int longestConsecutive(int[] nums) {
        List<Integer> list  = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }
        int max = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            int curr = list.get(i);
            int currLen = 1 ;
            while(list.contains(curr+1)){
                curr = curr + 1;
                currLen ++;
            }
            max = Math.max(currLen,max);
        }
        return max;
    }
}
