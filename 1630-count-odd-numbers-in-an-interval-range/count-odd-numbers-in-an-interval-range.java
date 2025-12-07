class Solution {
    public int countOdds(int low, int high) {
        if(low%2==0 && high%2==0)return (high-low+1)/2;
        else if(low%2!=0 && high%2!=0) return ((high-low+1)/2)+1;
        else return (high-low+1)/2;
    }
}