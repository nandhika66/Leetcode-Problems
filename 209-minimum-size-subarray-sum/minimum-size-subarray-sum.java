import java.util.*;
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0, minCount = Integer.MAX_VALUE ;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                minCount = Math.min(minCount,right-left+1);
                sum-=nums[left];
                left++;
                
            }
        }
        return minCount == Integer.MAX_VALUE ? 0 : minCount;
    }
}