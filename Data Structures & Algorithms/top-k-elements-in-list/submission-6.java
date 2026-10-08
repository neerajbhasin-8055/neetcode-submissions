class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer>[] buckets = new List[nums.length+1];
        map.forEach((num,freq)->{
            if(buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        });
        int index = 0;
        int result[] = new int[k];
        for(int i = buckets.length-1;i>0;i--){
            if(buckets[i]!=null){
                for(int num : buckets[i]){
                    result[index++] = num;
                    if(index == k){
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
