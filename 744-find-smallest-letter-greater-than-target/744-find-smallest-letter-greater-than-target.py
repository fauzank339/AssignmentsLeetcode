class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        lo = 0
        hi = len(letters)
        
        while lo < hi :
            mid = (lo + hi) // 2
            
            if letters[mid] > target :
                hi = mid 
            else :
                lo =  mid + 1
        
        return letters[lo%len(letters)]
        