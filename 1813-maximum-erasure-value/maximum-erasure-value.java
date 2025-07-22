import java.util.*;
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int left = 0, right = 0, maxSum = 0, currSum = 0;
        while (right < nums.length) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                currSum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            currSum += nums[right];
            maxSum = Math.max(maxSum, currSum);
            right++;
        }
        return maxSum;
    }
}