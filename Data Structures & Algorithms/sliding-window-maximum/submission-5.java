class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result =  new int[n-k+1];
        int resPointer = 0 ;
        int i = 0 ;
        int j = 0 ;
        Deque<Integer> q = new ArrayDeque<>();
        while(j < n ) {
            while(!q.isEmpty() && nums[j] > nums[q.peekLast()]){
                q.removeLast();
            }
            q.addLast(j);
            if(j-i+1==k){
                result[resPointer++] = nums[q.peekFirst()];
                if(q.peekFirst() == i){
                    q.removeFirst();
                }
                i++;
            }
            j++;
        }
        return result;
    }
}
