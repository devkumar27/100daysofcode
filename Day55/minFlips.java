class Solution {
    public int minFlips(int a, int b, int c) {
        int flips = 0;
        while(a!=0 || b!=0 || c!=0) {
            int al = a & 1;
            int bl = b & 1;
            int cl = c & 1;
            if((al | bl) != cl) {
                if((al & bl) == 1) {
                    flips +=2;
                }
                else {
                    flips++;
                }
            }
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }    

        return flips;
    }
}
