class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int ind=0;
        boolean start=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1 && !start){
                ind=i;
                start=true;
            }else if(nums[i]==1 && start){
                if((i-ind-1)<k ){
                    return false;
                }else{
                    ind=i;
                }
            }
        }
        return true;
    }
}