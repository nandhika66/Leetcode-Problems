class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch :s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                char pop = stack.pop();
                if((pop=='(' && ch!=')')||(pop=='[' && ch!=']')||(pop=='{' && ch!='}')){
                    return false;
                }
            }
        }
        if(stack.isEmpty())return true;
        return false;
    }
}