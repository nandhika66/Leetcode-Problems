class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a,b) -> {
            if(a[0]==b[0]){ // first col same.. give pref to second col
                return a[1]-b[1]; 
            }else{
                return b[0]-a[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<people.length;i++){
            list.add(people[i][1] , people[i]);
        }
        int[][] ans = list.toArray(new int[0][]);
        return ans;
    }
}