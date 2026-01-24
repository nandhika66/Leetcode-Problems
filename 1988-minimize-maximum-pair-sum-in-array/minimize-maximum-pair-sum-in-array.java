class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[nums.length-i-1]+nums[i]);
        }
        return max;
    }
}