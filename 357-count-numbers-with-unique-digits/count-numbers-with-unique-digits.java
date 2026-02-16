class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int totalNums = 10;
        int prod = 9;
        for (int i = 2; i < n + 1; i++) {
            totalNums += prod * (11 - i);
            prod *= 11 - i;
        }
        return totalNums;
    }
}