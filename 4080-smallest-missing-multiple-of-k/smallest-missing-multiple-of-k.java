class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int i = 1;
        int ans = 0;
        while(true){
            if(!set.contains(k*i)){
                ans =  k*i;
                break;
            }
            i++;
        }
        return ans;
    }
}