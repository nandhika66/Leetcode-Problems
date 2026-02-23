class Solution {
    public int countPrimes(int n) {
        if (n == 0) return 0;        
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);       
        int count = 0;
        prime[0] =false;
        if (n > 1) prime[1] = false;        
        for (int i = 0; i < n; i++) {
            if (prime[i]) {
                count++;
                int j = i * 2;
                while (j < n) {
                    prime[j] = false;
                    j =j + i;
                }
            }
        }        
        return count;
    }
}