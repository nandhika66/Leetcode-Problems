import java.util.*;
class Solution {
    public int minDistance(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int dp[][] = new int[l1+1][l2+1];
        for(int i=0;i<l2+1;i++){
            dp[l1][i]=l2-i;
        }
        for(int i=0;i<l1;i++){
            dp[i][l2]=l1-i;
        }
        for(int i=l1-1;i>=0;i--){
            for(int j=l2-1;j>=0;j--){
                if(word1.charAt(i)==word2.charAt(j)){
                    dp[i][j]=dp[i+1][j+1];
                }else{
                    dp[i][j]=Math.min(Math.min(dp[i+1][j],dp[i][j+1]),dp[i+1][j+1]) + 1;
                }
            }
        }
        return dp[0][0];
    }
}