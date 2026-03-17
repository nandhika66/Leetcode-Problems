class Solution {
    public int findMinArrowShots(int[][] points) {
        int count = 1;
        Arrays.sort(points,(a,b) -> Integer.compare(a[1],b[1]));
        int last = points[0][1];
        for(int i=1;i<points.length;i++){
            if(last<points[i][0]){
                count++;
                last = points[i][1];
            }
        }
        return count;
    }
}