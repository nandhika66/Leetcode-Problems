class Solution {
    public int maxSum(int[] nums) {
        // Check if all elements are negative
        boolean allNegative = true;
        int maxValue = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n >= 0) {
                allNegative = false;
            }
            if (n > maxValue) {
                maxValue = n;
            }
        }
        if (allNegative)
            return maxValue;

        // Use a set to remove duplicates
        Set<Integer> unique = new HashSet<>();
        for (int n : nums) {
            unique.add(n);
        }

        // Sum all positive numbers from the set
        int sum = 0;
        for (int val : unique) {
            if (val > 0) {
                sum += val;
            }
        }

        return sum;
    }
}
