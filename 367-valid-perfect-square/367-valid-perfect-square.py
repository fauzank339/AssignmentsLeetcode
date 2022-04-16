class Solution:
    def isPerfectSquare(self, x: int) -> bool:
        if x==1:
            return True
        start=0
        end=x//2
        while start<=end:
            mid=start+(end-start)//2
            if mid*mid == x:
                return True
            elif mid*mid<x:
                start=mid+1
            else:
                end=mid-1
        return False