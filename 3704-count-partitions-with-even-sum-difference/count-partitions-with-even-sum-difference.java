class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        for(int i=0;i<nums.length;i++){
            total += nums[i];
        }
        int rem = 0;
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            rem += nums[i];
            total-=nums[i];
            if((total-rem)%2 == 0){
                count++;
            }
        }
        return count;
    }
}