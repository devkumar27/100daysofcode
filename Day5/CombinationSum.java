class Solution {
    public void findCombinations(int ind, int[] candidates, List<List<Integer>> res, int target, List<Integer> combo) {
        //base case
        if(ind == candidates.length) {
            if(target == 0) {
                res.add(new ArrayList<>(combo));
            }
            return;
        }

        //rec case
        if(candidates[ind] <= target) {
            combo.add(candidates[ind]);
            findCombinations(ind, candidates, res, target-candidates[ind], combo);
            combo.remove(combo.size()-1);
        }
        findCombinations(ind+1, candidates, res, target, combo);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        findCombinations(0, candidates, res, target, new ArrayList<Integer>());
        return res;        
    }
}
