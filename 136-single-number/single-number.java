class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int val:nums){
            ans^=val;
        }
        return ans;
    }
}
//here the key for XOR is: a^a=0 & a^0=a -> we are doing 2^2^1 -> 0^1 -> returns 1