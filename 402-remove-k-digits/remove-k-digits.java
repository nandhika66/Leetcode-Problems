class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();
        int n = num.charAt(0) - '0';
        if(num.length()==1) return "0";
        stack.push(n);
        for(int i=1;i<num.length();i++){
            n = num.charAt(i) - '0';
            while( !stack.isEmpty()&& stack.peek()>n && k>0){
                stack.pop();
                k--;
            }
            stack.push(n);
        }
        System.out.println(stack);
            while(k>0){
                stack.pop();
                k--;
            }
        
        StringBuilder s = new StringBuilder();
        for(int val:stack){
            s.append(val);
        }
        System.out.println(s);
        if(s.toString().equals("0")) return s.toString();
        while(s.length()>0 && s.charAt(0)=='0'){
            s.deleteCharAt(0);
        }
        if(s.toString().equals("")) return "0";
        return s.toString();
    }
}