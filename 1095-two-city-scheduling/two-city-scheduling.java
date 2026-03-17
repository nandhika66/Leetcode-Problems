class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int ans=0;
        int n = costs.length/2;
        Arrays.sort(costs, (a,b)->(a[0]-a[1])-(b[0]-b[1]));
        //sorts by difference of elements
        for(int i=0;i<n;i++){
            ans+=costs[i][0];
        }
        for(int i=n;i<costs.length;i++){
            ans+=costs[i][1];
        }
        return ans;
    }
}