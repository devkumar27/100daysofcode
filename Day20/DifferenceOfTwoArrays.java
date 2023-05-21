// LC2215 - https://leetcode.com/problems/find-the-difference-of-two-arrays/
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> ans1 = new HashSet<>();
        HashSet<Integer> ans2 = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<nums1.length; i++) {
            ans1.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++) {
            ans2.add(nums2[i]);
            if(ans1.contains(nums2[i])) {
                ans1.remove(nums2[i]);
            }
        }

        for(int i=0; i<nums1.length; i++) {
            if(ans2.contains(nums1[i])) {
                ans2.remove(nums1[i]);
            }
        }

        ans.add(new ArrayList<>(ans1));
        ans.add(new ArrayList<>(ans2));
        return ans;
    }
}
