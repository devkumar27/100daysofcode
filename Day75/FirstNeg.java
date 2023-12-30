class FirstNeg {
    
    public long[] printFirstNegativeInteger(long arr[], int n, int k) {
        int i = 0;
        int j = 0;
        List<Long> neg = new ArrayList<>();
        long[] res = new long[n-k+1];
        int ind = 0;
        while(j < n || ind < n-k+1) {
            if(arr[j] < 0) {
                neg.add(arr[j]);
            }
            if(j-i+1 < k) {
                j++;
            }
            else if(j-i+1 == k) {
                if(neg.size() == 0) {
                    res[ind] = 0;
                    ind++;
                }
                else {
                    res[ind] = neg.get(0);
                    ind++;
                }
                if(arr[i] < 0) {
                    neg.remove(0);
                }
                i++;
                j++;
            }
            
        }
        
        return res;
    }
}
