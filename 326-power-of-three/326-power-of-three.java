class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1)
            return true;
        if(n==0)
            return false;
        return isPowerOfThree(n/3) && n%3==0;
    }
}