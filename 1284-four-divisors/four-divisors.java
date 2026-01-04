class Solution {
    public int fac(int num,int sum,int n){
        int val = 0;
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0 && count<5){
                val+=i;
                count++;
            }
            if(count>4){
                return 0;
            }
        }
        if(count==4){
            return val;
        }
        return 0;
    }
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int val = fac(nums[i],sum,n);
            sum+=val;
       }
       return sum; 
    }
}