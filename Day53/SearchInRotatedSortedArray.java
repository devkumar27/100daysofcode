class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) {
            return -1;
        }
        
        int beg = 0;
        int end = nums.length-1;
        int mid = beg + (end - beg)/2;
        if(nums[mid] == target) {
            return mid;
        }

        while(beg < end) {
            mid = beg + (end - beg)/2;

            if(nums[mid] == target) return mid;

            if(nums[mid] > nums[end]) {
                beg = mid+1;
            } else {
                end = mid;
            }
        }

        int min = beg;
        beg = 0;
        end = nums.length - 1;
        if(target >= nums[min] && target <= nums[end]) {
            beg = min;
        } else {
            end = min;
        }

        while(beg <= end) {
            mid = beg + (end - beg)/2;
            if(target == nums[mid]) {
                return mid;
            } else if(target < nums[mid]) {
                end = mid-1;
            } else {
                beg = mid+1;
            }
        }

        return -1;
    }
}
