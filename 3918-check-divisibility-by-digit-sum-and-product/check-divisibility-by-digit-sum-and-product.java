class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, prod = 1;
        int org = n;
        while(n > 0){
            int d = n%10;
            sum += d;
            prod *= d;
            n/=10;
        }
        if(org%(sum+prod)==0){
            return true;
        }
        return false;
    }
}