class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                k++;
            }else break;
        }
        return k;
    }
}
//Every time the array contains a number ≤ k, it “steals” one missing spot, so we push k forward by 1