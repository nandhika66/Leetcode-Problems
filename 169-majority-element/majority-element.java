class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        Arrays.sort(nums);
        int max =0;
        int fin=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }else{
                if(count>max){
                    max=count;
                    fin=nums[i];
                    count=1;
                }
            }
        }
        if(count>max) fin = nums[nums.length-1];
        return fin;
    }
}