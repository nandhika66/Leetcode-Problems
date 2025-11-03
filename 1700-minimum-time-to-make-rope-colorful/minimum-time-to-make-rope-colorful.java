import java.util.*;
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time = 0, total = neededTime[0], max = neededTime[0];
        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i - 1) == colors.charAt(i)) {
                total += neededTime[i];
                max = Math.max(max, neededTime[i]);
            } else {
                time += total - max;
                total = neededTime[i];
                max = neededTime[i];
            }
        }
        time += total - max;
        return time;
    }
}
