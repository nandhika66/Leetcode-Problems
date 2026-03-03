class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length- 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1])
            {
                return nums[mid];
            } 
            if (mid < nums.length-1 && nums[mid] > nums[mid + 1]) return nums[mid + 1];
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }
            else if (nums[mid] > nums[end]) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return nums[0];
    }
}