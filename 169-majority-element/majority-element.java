class Solution {
    public int majorityElement(int[] nums) {
        int ans=0;
        int major = 0;
        for(int i=0;i<nums.length;i++){
            if(major==0){
                ans= nums[i];
            }
            if(ans==nums[i]){
                major++;
            }else{
                major--;
            }
        }
        return ans;
    }
}
//here since the majority element occurs more than n/2 times, the non major element will cancel out and major cannot cancel exactly