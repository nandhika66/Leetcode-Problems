class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> vals = new HashMap<>();
        int max = 0;
        int fin =0;
        for(int i=0;i<nums.length;i++){
            vals.put(nums[i],vals.getOrDefault(nums[i],0)+1);
            if(vals.get(nums[i])>max){
                max = vals.get(nums[i]);
                fin = nums[i];
            }
        }
        return fin;
    }
}