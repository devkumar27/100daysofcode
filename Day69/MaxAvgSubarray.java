class MaxAvgSubarray {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int left = 0, right = k-1;
        int[] prefixSums = new int[n];
        int sum = 0, leftSum = 0;
        for(int i=0; i<n; i++) {
            sum += nums[i];
            prefixSums[i] = sum;
        }
        double maxSum = Integer.MIN_VALUE;
        while(right < n) {
            double currSum = (prefixSums[right] - leftSum);
            maxSum = Math.max(currSum, maxSum);
            leftSum += nums[left];
            left++;
            right++;
        }

        return maxSum / k;
    }
}
