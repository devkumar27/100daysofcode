class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for(int i=2; i<arr.length; i++) {
            int temp = arr[i] - arr[i-1];
            if(diff != temp) return false;
        }
        return true;
    }
}
