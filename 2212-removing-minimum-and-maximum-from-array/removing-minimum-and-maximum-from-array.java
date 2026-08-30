class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length == 1 || nums.length == 2){
            return nums.length;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minInd = 0, maxInd = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
                minInd = i;
            }
            if(nums[i] > max){
                max = nums[i];
                maxInd = i;
            }
        }

        int left = Math.min(minInd, maxInd);
        int right = Math.max(minInd, maxInd);

        int fromFront = right + 1;
        int fromBack = nums.length - left;
        int fromBoth = (left + 1) + (nums.length - right);

        return Math.min(fromFront, Math.min(fromBack, fromBoth));
    }
}