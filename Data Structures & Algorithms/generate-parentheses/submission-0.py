class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res = []
        def gen(left,right,st):
            if len(st) == n*2:
                res.append(st)
                return 
            if left < n :
                gen(left+1,right,st+"(")
            if right < left :
                gen(left,right+1,st+")")
        gen(0,0,'')
        return res