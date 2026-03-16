class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int b=stack.pop();
                int a=stack.pop();
                if(token.equals("+")){
                    a=a+b;
                }else if(token.equals("-")){
                    a=a-b;
                }else if(token.equals("*")){
                    a=a*b;
                }else{
                    a=a/b;
                }
                stack.push(a);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}