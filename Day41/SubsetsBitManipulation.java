class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<Math.pow(2, nums.length); i++) {
            int temp = i;
            List<Integer> subset = new ArrayList<>();
            for(int j=0; j<nums.length; j++) {
                if((temp&1) == 1) {
                    subset.add(nums[j]);
                }
                temp = temp>>1;
            }
            res.add(subset);
        }

        return res;
    }
}
