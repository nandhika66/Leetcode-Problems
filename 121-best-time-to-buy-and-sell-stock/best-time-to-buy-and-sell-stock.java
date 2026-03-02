class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int max=0;
        for(int r=1;r<prices.length;r++){
            if(prices[l]>prices[r]){
                l=r;
            }else{
                max=Math.max(max,prices[r]-prices[l]);
            }
        }
        return max;
    }
}