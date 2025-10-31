import java.util.*;
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans[] = new int[2];
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                ans[a]=nums[i];
                a++;
            }
            if(a==2) break;
            set.add(nums[i]);
        }
        return ans;
    }
}