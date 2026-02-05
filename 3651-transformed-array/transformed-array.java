class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            int ind=(((i+nums[i])%n)+n)%n;
            res[i] = nums[ind];
        }
        return res;
    }
}