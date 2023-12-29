class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0, right = 0, n = nums.length;
        long currSum = 0;
        long maxSum = 0;
        while(right < n) {
            int num = nums[right];
            while(set.contains(num) || set.size() == k) {
                set.remove(nums[left]);
                currSum -= nums[left];
                left++;
            }
            set.add(num);
            currSum += num;
            if(set.size() == k && currSum > maxSum) {
                maxSum = currSum;
            }
            right++;
        }
        return maxSum;
    }
}
