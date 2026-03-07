class Solution {
public int calculate(String s) {
    Stack<Integer> stack = new Stack<Integer>();
    int ans =0;
    int num =0;
    int sign =1;
    for(int i =0; i < s.length(); i++){
        char c =s.charAt(i);
        if(Character.isDigit(c)){
            num = 10 * num + (int)(c -'0');
        }else if(c == '+'){
            ans += sign * num;
            num = 0;
            sign = 1;
        }else if(c == '-'){
            ans += sign * num;
            num = 0;
            sign = -1;
        }else if(c == '('){
            stack.push(ans);
            stack.push(sign);
            sign = 1;   
            ans = 0;
        }else if(c == ')'){
            ans += sign * num;  
            num =0;
            ans *= stack.pop();
            ans += stack.pop();
            
        }
    }
    if(num != 0) ans += sign * num;
    return ans;
}
}