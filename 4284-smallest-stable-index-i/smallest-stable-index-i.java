class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max[] = new int[nums.length];
        int min[] = new int[nums.length];
        int maxVal = 0;
        for(int i=0;i<nums.length;i++){
            maxVal = Math.max(maxVal,nums[i]);
            max[i] = maxVal;
        }
        int minVal = Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            minVal = Math.min(minVal,nums[i]);
            min[i] = minVal;
        }
        for(int i=0;i<nums.length;i++){
            if(max[i]-min[i] <= k){
                return i;
            }
        }
        return -1;
    }
}