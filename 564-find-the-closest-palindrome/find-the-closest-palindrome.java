class Solution {
    public String nearestPalindromic(String numberStr) {
        long number= Long.parseLong(numberStr);
        if (number <= 10) return String.valueOf(number - 1);
        if (number == 11) return "9";
        int length = numberStr.length();
        long leftHalf = Long.parseLong(numberStr.substring(0, (length + 1) / 2));        
        long[] palind = new long[5];
        palind[0] = Palindrome(leftHalf - 1, length % 2 == 0);
        palind[1] = Palindrome(leftHalf, length % 2 == 0);
        palind[2] = Palindrome(leftHalf + 1, length % 2 == 0);
        palind[3] = (long)Math.pow(10, length - 1) - 1;
        palind[4] = (long)Math.pow(10, length) + 1;
        long nearestPalindrome = 0;
        long minDifference = Long.MAX_VALUE;
        for (long candidate : palind) {
            if (candidate == number) continue;
            long difference = Math.abs(candidate - number);
            if (difference < minDifference || (difference == minDifference && candidate < nearestPalindrome)) {
                minDifference = difference;
                nearestPalindrome = candidate;
            }
        }
        return String.valueOf(nearestPalindrome);
    }
    private long Palindrome(long leftHalf, boolean isEvenLength) {
        long palindrome = leftHalf;
        if (!isEvenLength) leftHalf /= 10;
        while (leftHalf > 0) {
            palindrome = palindrome * 10 + leftHalf % 10;
            leftHalf /= 10;
        }
        return palindrome;
    }
}