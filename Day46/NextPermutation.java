class Solution {
    public void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if(n<2) return;
        int ind = -1;
        for(int i=n-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                ind = i;
                break;
            }
        }
        if(ind == -1) {
            Arrays.sort(nums);
            return;
        }
        for(int i=n-1; i>ind; i--) {
            if(nums[i] > nums[ind]) {
                swap(nums, i, ind);
                break;
            }
        }
        int i = ind+1;
        int j = n-1;
        while(i<j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
