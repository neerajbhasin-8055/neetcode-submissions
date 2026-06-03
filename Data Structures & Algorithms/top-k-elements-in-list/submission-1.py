class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        cnt = {}
        for num in nums :
            if num in cnt :
                cnt[num] += 1 
            else:
                cnt[num] = 1 
        sorted_items = sorted(cnt.items(), key=lambda item: item[1], reverse=True)
        res = []
        while k > 0:
            for key, value in sorted_items :
                res.append(key)
                k -= 1
                if k == 0 :
                    break
        return res
