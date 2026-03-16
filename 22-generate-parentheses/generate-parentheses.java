class Solution {
    public void backtrack(Stack<Character> stack, int n, int open, int close, List<String> ans){
        if(stack.size()==2*n){
            StringBuilder s = new StringBuilder();
            for(char val:stack){
                s.append(val);
            }
            ans.add(s.toString());
        }
        if(open<n){
            stack.push('(');
            backtrack(stack,n,open+1,close,ans);
            stack.pop();
        }
        if(close<open){
            stack.push(')');
            backtrack(stack,n,open,close+1,ans);
            stack.pop();
        }
    }
    public List<String> generateParenthesis(int n) {
        Stack<Character> stack = new Stack<>();
        List<String> ans = new ArrayList<>();
        backtrack(stack,n,0,0,ans);
        return ans;
    }
}