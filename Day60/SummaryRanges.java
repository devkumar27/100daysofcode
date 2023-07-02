class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if(nums.length == 0) {
            return res;
        }
        if(nums.length == 1) {
            res.add(Integer.toString(nums[0]));
            return res;
        }
        for(int i=0; i<nums.length; i++) {
            int num = nums[i];
            while(i+1<nums.length && nums[i] + 1 == nums[i+1]) {
                i++;
            }
            if(num == nums[i]) {
                res.add(Integer.toString(num));
            }
            else {
                res.add(num + "->" + nums[i]);
            }
        } 

        return res;
    }
}
