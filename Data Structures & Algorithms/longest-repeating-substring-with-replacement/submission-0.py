class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        cnt = {}
        i = j = maxLen = maxF = 0 
        while j < len(s) :
            if s[j] in cnt :
                cnt[s[j]] += 1 
            else:
                cnt[s[j]] = 1 
            maxF = max(cnt.values())
            if (j-i+1) - maxF > k :
                cnt[s[i]] -= 1 
                i += 1 
            maxLen = max(j-i+1, maxLen)
            j += 1
        return maxLen