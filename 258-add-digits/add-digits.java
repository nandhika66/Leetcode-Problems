class Solution {
    public int addDigits(int num) {
        int ans;
        while(num>9){
            ans=0;
            while(num>0){
                int d = num%10;
                ans+=d;
                num/=10;
            }
            num=ans;
        }
        return num;
    }
}