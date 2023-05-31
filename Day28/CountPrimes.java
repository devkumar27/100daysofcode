class Solution {
    public int countPrimes(int n) {
        if(n<2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        int countPrimes = 0;
        for(int i=2; i*i<n; i++) {
            if(isPrime[i]) {
                for(int j=i; j*i<n; j++) {
                    isPrime[j*i] = false;
                }
            }
        }
        for(int i=2; i<n; i++) {
            if(isPrime[i]) {
                countPrimes++;
            }
        }
        return countPrimes;
    }
}
