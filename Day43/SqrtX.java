class Solution {
    public int mySqrt(int n) {
        if(n == 0) return 0;
        int beg = 1, end = n;
        int ans = -1;
        while(beg<=end) {
            int mid = beg + (end-beg)/2;
            if(mid == n/mid) {
                return mid;
            }
            if(mid > n/mid) {
                end = mid-1;
            }
            else {
                beg = mid+1;
            }
        }
        return end;
    }
}
