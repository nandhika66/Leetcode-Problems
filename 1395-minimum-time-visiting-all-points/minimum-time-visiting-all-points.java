class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for(int i=1;i<points.length;i++){
            int prevx = points[i-1][0];
            int prevy = points[i-1][1];
            int curx = points[i][0];
            int cury = points[i][1];
            ans += Math.max(Math.abs(prevx-curx),Math.abs(prevy-cury));
        }
        return ans;
    }
}