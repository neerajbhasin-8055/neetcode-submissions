class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = max(weights);
        int high = totalSum(weights);
        while(low < high){
            int mid = (low + high)/2;
            if(helper(mid,weights,days)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public int totalSum(int[] weights){
        int sum  = 0 ;
        for(int num : weights){
            sum+= num;
        }
        return sum;
    }
    public int max(int[] weights){
        int m = 0 ;
        for(int num : weights){
            m = Math.max(num,m);
        }
        return m;
    }
    public boolean helper(int mid, int[] heights, int days){
        int totalDays = 1;
        int sum = 0 ;
        for(int num : heights){
            if(sum + num > mid){
                totalDays++;
                sum = 0;
            }
            sum += num;
        }
        return totalDays <= days;
    }
}