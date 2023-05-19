//LC128- https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) {
            return 0;
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        int maxLen = 0;
        for(int i=0; i<nums.length; i++) {
            if(!set.contains(nums[i]-1)){
                int temp = nums[i];
                int currLen = 1;
                while(set.contains(temp+1)) {
                    temp++;
                    currLen++;
                }
                maxLen = Math.max(maxLen, currLen);
            }
        }

        return maxLen;
    }
}
