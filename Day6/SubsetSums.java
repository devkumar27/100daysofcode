//GFG Practice - https://practice.geeksforgeeks.org/problems/subset-sums2234/1

class Solution{
    void findSubsets(ArrayList<Integer> arr, int ind, int n, int sum, ArrayList<Integer> subsets) {
        //base case
        if(ind == n) {
            subsets.add(sum);
            return;
        }
        
        //rec case
        findSubsets(arr, ind+1, n, sum+arr.get(ind), subsets); //for selecting an element in arr
        findSubsets(arr, ind+1, n, sum, subsets); //for not selecting a particular element in arr
    }
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
        ArrayList<Integer> subsets = new ArrayList<Integer>();
        findSubsets(arr, 0, n, 0, subsets);
        Collections.sort(subsets);
        return subsets;
    }
}
