class Solution {
    public int[] evenOddBit(int n) {
        int[] res = new int[2];
        boolean evenTurn = true;
        while(n>0) {
            int last = n&1;
            if(last == 1) {
                if(evenTurn) {
                    res[0]++;
                }
                else {
                    res[1]++;
                }
            }
            n = n>>1;
            evenTurn = !evenTurn;
        }
        return res;
    }
}
