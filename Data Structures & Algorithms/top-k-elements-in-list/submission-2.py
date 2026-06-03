class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        cnt = {}
        for num in nums :
            if num in cnt :
                cnt[num] += 1
            else:
                cnt[num] = 1 
        srtd  = sorted(cnt.items(),key=lambda x :x[1],reverse= True) 
        res = []
        for key,value in srtd :
            res.append(key)
            k -= 1
            if k == 0 :
                break 
        return res

        