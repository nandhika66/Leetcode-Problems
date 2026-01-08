class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        
        if (m > n) {
            return maxDotProduct(nums2, nums1);
        }
        
        int[] dp = new int[m + 1];
        Arrays.fill(dp, -1000000000); 
        
        for (int i = 1; i <= n; i++) {
            int prev_diag = -1000000000;
            
            for (int j = 1; j <= m; j++) {
                int curr_product = nums1[i-1] * nums2[j-1];
                int temp = dp[j];
                
                int option1 = curr_product;
                int option2 = curr_product + prev_diag;
                int option3 = dp[j];
                int option4 = dp[j-1];
                
                dp[j] = Math.max(Math.max(option1, option2), Math.max(option3, option4));
                
                prev_diag = temp;
            }
        }
        
        return dp[m];
    }
}