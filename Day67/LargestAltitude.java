class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length + 1];
        int prefixSum = 0;
        for(int i=0; i<gain.length; i++) {
            prefixSum += gain[i];
            altitudes[i+1] = prefixSum;
        }
        int maxAltitude = Integer.MIN_VALUE;
        for(int i=0; i<altitudes.length; i++) {
            maxAltitude = Math.max(maxAltitude, altitudes[i]);
        }
        return maxAltitude;
    }
}
