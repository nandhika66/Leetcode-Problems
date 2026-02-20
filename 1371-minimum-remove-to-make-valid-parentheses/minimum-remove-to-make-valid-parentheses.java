public class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') open++;
            else if (c == ')' && open == 0) continue;
            else if (c == ')') open--;
            sb.append(c);
        }
        StringBuilder ans = new StringBuilder();
        for (int i =sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            if (c == '(' && open-- > 0) continue;
            ans.append(c);
        }
        return ans.reverse().toString();
    }
}