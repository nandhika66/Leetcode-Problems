import java.util.*;
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int copy[] = Arrays.copyOf(nums,nums.length);
        Arrays.sort(copy);
        int i=0, j=nums.length-1;
        while(i<nums.length && nums[i]==copy[i]){
            i++;
        }
        while(j>=0 && nums[j]==copy[j]){
            j--;
        }
        if(i>j){
            return 0;
        }else{

        return j-i+1;
        }
    }
}