class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0; // handle empty needle case
        
        int i = 0, j = 0;
        int start = -1;
        boolean flag = false;
        
        while (i < haystack.length()) {
            if (j < needle.length() && haystack.charAt(i) == needle.charAt(j)) {
                if (!flag) {
                    start = i;
                    flag = true;
                }
                i++;
                j++;
                if (j == needle.length()) { // entire needle matched
                    return start;
                }
            } else if (flag) {
                // mismatch after some matched chars, reset j and use next index after start for i
                i = start + 1;
                j = 0;
                flag = false;
                start = -1;
            } else {
                i++;
            }
        }
        return -1;
    }
}
