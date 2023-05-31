class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1) return;
        int i = 0;
        while(i<nums.length) {
            if(nums[i] == 0) break;
            i++;
        }
        int j = i+1;
        while(i<nums.length && j<nums.length) {
            if(nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
    }
}
