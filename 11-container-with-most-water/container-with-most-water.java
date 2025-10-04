import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int maxWater = 0;

        while (l < r) {
            int minH = Math.min(height[l], height[r]);
            int water = (r - l) * minH;  

            maxWater = Math.max(maxWater, water);  

           
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxWater;
    }
}