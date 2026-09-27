class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder word = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(word);
                word = new StringBuilder();
            } else if (ch == ')') {
                word.reverse();
                word = st.pop().append(word);
            } else {
                word.append(ch);
            }
        }

        return word.toString();
    }
}