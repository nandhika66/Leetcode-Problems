class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                count++;
            }else{
                count--;
            }
        }
        if(nums[nums.length-1]<=nums[0]){
            count++;
        }else{
            count--;
        }
        if(count>=nums.length-2){
            return true;
        }
        return false;
    }
}