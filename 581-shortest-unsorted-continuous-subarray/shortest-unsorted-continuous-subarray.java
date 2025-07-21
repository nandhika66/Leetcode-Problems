import java.util.*;
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int []cmp = Arrays.copyOf(nums,nums.length);
        Arrays.sort(cmp);
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]==cmp[i]){
                i++;
            }else{
                break;
            }
        }
        while(i<j){
            if(nums[j]==cmp[j]){
                j--;
            }else{
                break;
            }
        }
        if(i==nums.length-1) return 0;
        return j-i+1;
    }
}