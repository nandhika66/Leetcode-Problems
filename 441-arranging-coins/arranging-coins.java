class Solution {
    public int arrangeCoins(int n) {
        return (int)Math.floor(-0.5 + Math.sqrt(2L * n + 0.25));
    }
}