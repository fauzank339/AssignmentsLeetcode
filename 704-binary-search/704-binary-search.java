class Solution {
    public int search(int[] nums, int target) {
        return BinSearch(nums,target,0,nums.length-1);
    }
    public int BinSearch(int[] nums,int target,int start, int end)
        {
        int mid = start+(end-start)/2;
        if (start>end)
            return -1;
        if(nums[mid]==target)
            return mid;
        if(nums[mid]>target)
            return BinSearch(nums,target,start,mid-1);
        else
            return BinSearch(nums,target,mid+1,end);
    }
}