class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            if(start == end) {
                nums[start] *= nums[start];
                break;
            }
            nums[start] *= nums[start];
            nums[end] *= nums[end];
            start++;
            end--;
        }
        Arrays.sort(nums);
        return nums;
    }
}
