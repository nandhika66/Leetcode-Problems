class Solution {
    public int minDeletionSize(String[] strs) {
        int col = strs[0].length(); 
        int row = strs.length;       
        int res = 0;  
        boolean[] sortedPairs = new boolean[row - 1];  

        for (int c = 0; c < col; ++c) { 
            boolean check = true;  

            for (int r = 0; r < row - 1; ++r) {
                if (!sortedPairs[r] && strs[r].charAt(c) > strs[r + 1].charAt(c)) {
                    check = false;
                    break;
                }
            }

            if (!check) {
                res++;  
                continue;
            }

            for (int r = 0; r < row - 1; ++r) {
                if (!sortedPairs[r] && strs[r].charAt(c) < strs[r + 1].charAt(c)) {
                    sortedPairs[r] = true;  
                }
            }
        }

        return res;
    }
}