class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        boolean flag=false;
        int count =0;
        for(int r=1;r<prices.length;r++){
            if(prices[l]>prices[r] && !flag){
                l=r;
            }else if(!flag){
                flag=true;
            }else if(flag && prices[r-1]>prices[r]){
                count += prices[r-1]-prices[l];
                l=r;
                flag=false;
            }
        }
        if(flag){
            count+=prices[prices.length-1]-prices[l];
        }
        return count;
    }
}