class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = max(piles);
        int ans = 0;
        while(low < high){
            int mid  = (low + high) /2 ;
            if(speed(piles,mid,h)){
                high = mid ;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public int max(int[] piles){
        int mx = 0;
        for(int num : piles){
            mx = Math.max(mx,num);
        }
        return mx;
    }
    public boolean speed(int[] piles, int mid , int h){
        int th = 0 ;
        for(int num : piles){
            th += Math.ceil((double)num/mid);
        }
        return th <= h;
    }
}
