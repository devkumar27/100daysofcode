// LC-46 - https://leetcode.com/problems/permutations/
class Solution {
    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void findPermutation(int ind, int[] nums, List<List<Integer>> ans) {
        //base case
        if(ind == nums.length) {
            List<Integer> perm = new ArrayList<>();
            for(int i=0; i<nums.length; i++) {
                perm.add(nums[i]);
            }
            ans.add(new ArrayList<>(perm));
            return;
        }

        //rec case
        for(int i=ind; i<nums.length; i++) {
            swap(i, ind, nums);
            findPermutation(ind+1, nums, ans);
            swap(i, ind, nums);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findPermutation(0, nums, ans);
        return ans;
    }
}
