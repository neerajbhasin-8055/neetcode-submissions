class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) < len(t) or len(t) < len(s) :
            return False
        return sorted(s) == sorted(t)