import java.util.*;
class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int color[] = new int[n];
        for(int i=0;i<n;i++){
            if (color[i] != 0){
                continue;
            }
            Queue<Integer> queue = new LinkedList<>();
            queue.add(i);
            color[i]=1;
            while(!queue.isEmpty()){
                int qpe = queue.poll();
                for(int adj:graph[qpe]){
                    if(color[adj]==0){
                        if(color[qpe]==1){
                            color[adj]=2;
                        }else if(color[qpe]==2){
                            color[adj]=1;
                        }
                        queue.add(adj);
                    }else if(color[adj]==color[qpe]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}