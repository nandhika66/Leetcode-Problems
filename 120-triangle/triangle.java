class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        //dp only but we are using the same arraylist itself
        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=triangle.get(i).size()-1;j>=0;j--){
                triangle.get(i).set(j,triangle.get(i).get(j) + Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }
}