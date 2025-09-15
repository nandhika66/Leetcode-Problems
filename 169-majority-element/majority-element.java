class Solution {
    public int majorityElement(int[] nums) {
        int major = 0,res=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>major){
                major=map.get(nums[i]);
                res = nums[i];
            }
        }
        return res;
        
    }
}