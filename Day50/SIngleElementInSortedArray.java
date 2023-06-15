class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
        int beg = 0, end = nums.length-1;
        
        while(beg < end) {
            int mid =  beg + (end-beg)/2;
            if(mid%2 == 1) {
                mid--;
            }
            if(nums[mid] != nums[mid+1]) {
                end = mid;
            }
            else {
                beg = mid+2;
            }
        }
        return nums[beg];
    }
}
