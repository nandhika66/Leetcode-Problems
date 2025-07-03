import java.util.*;
class Solution {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int cmpSum = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            int j = i+1, k = nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                int diffcmp = target - cmpSum;
                int diff = target - sum;
                if(Math.abs(diff) < Math.abs(diffcmp)){
                    cmpSum = sum;
                }
                if(sum==target){
                    return target;
                }
                if(sum<target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return cmpSum;
    }
}