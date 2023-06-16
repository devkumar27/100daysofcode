class Solution {
    public int findMin(int[] nums) {
        int beg = 0;
        int end = nums.length - 1;
        while(beg < end) {
            int mid = beg + (end - beg)/2;
            if(nums[end] < nums[mid]) {
                beg = mid+1;
            }
            else {
                end = mid;
            }
        }

        return nums[end];
    }
}
