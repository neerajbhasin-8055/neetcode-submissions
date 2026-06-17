class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int i = 0;
        int maxKey = 0;
        while(k > 0 ){
            maxKey = getMax(map);
            result[i] = maxKey;
            map.remove(maxKey);
            i++;
            k--;
        }
        return result;
    }
    public static <K,V extends Comparable<V>> K getMax (Map<K,V>map){
        K maxKey = null ;
        V maxVal =  null;
        for(Map.Entry<K,V> entry : map.entrySet()){
            if(maxVal == null || entry.getValue().compareTo(maxVal) > 0){
                maxVal = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    } 
}
