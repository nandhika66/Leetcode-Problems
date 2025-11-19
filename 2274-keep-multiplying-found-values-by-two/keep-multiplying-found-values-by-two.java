class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(true){
            int i;
            for(i=0;i<nums.length;i++){
                if(nums[i]==original){
                    original*=2;
                    break;
                }
            }
            if(i==nums.length){
                break;
            }
        }
        return original;
    }
}