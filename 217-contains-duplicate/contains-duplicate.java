import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            if(set.contains(n)){
                return true;
            }else{
                set.add(n);
            }
        }
        return false;
    }
}