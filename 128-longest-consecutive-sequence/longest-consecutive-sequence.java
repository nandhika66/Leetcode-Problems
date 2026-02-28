class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max=0;
        for(int n : set){
            if(!set.contains(n-1)){
                int cur=n;
                int count=1;
                while(set.contains(cur+1)){
                    cur++;
                    count++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}