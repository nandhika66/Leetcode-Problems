class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] r = new int[n];
        int depth = 0;
        for (int i = 0; i < n; i++) {
            if (seq.charAt(i) == '(') {
                // Level of '(' is after opening
                depth++;
                r[i] = depth & 1;
                continue;
            }
            // Level of ')' is before closing
            r[i] = depth & 1;
            depth--;
        }
        return r;
    }
}