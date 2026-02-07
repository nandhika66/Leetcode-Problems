class Solution {
    public int[] sortedSquares(int[] nums) {
        int ind = nums.length-1;
        int l = 0, r = nums.length-1;
        int arr[] = new int[nums.length];
        while(l<=r){
            int left = Math.abs(nums[l]);
            int right = Math.abs(nums[r]);
            if( left > right ){
                arr[ind] = left * left;
                l++;
            }else{
                arr[ind] = right * right;
                r--;
            }
            ind--;
        }
        return arr;
    }
}