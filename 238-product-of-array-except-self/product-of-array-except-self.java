class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int pre[] = new int[nums.length];
        int pos[]= new int[nums.length];
        pre[0]=1;
        pos[nums.length - 1]=1;
        for(int i =1;i<nums.length;i++){
            prod *= nums[i-1];
            pre[i]=prod;
        }
        prod =1;
        for(int i =nums.length-2;i>=0;i--){
            prod *= nums[i+1];
            pos[i]=prod;
        }
        for(int i=0;i<nums.length;i++){
            pre[i]*=pos[i];
        }
        return pre;
}}