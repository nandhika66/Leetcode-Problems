class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        Arrays.sort(tokens);
        int left = 0, high = tokens.length-1;
        int maxScore = 0;
        while(left <= high){
            if(power >= tokens[left]){
                score++;
                power = power - tokens[left];
                left++;
            }else if(score > 0){
                score--;
                power = power + tokens[high];
                high--;
            }else{
                break;
            }
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }
}