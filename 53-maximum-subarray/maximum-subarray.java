import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0], cur=nums[0];
        for(int i=1;i<nums.length;i++){
            cur= Math.max(cur + nums[i], nums[i]);
            max = Math.max(max,cur);
        }
        return max;
    }
}