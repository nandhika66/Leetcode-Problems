import java.util.*;
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=0, total=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:map.values()){
            if(i >max){
                max = i;
                total = max;
            }else if(i==max){
                total+=max;
            }
        }
        return total;
    }
}