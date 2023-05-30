class Solution {
    //Operator Precedence Function
    public static int precedence(char op) {
        if(op=='+' || op=='-') return 1;
        if(op=='*' || op=='/') return 2;
        if(op=='^') return 3;
        return -1;
    }
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        String res = "";
        Stack<Character> stk = new Stack<>();
        
        for(int i=0; i<exp.length(); i++) {
            char c = exp.charAt(i);
            //if the character is an operand
            if(Character.isLetterOrDigit(c)) {
                res += c;
            }
            //if the character is a parenthesis
            else if(c == '(') {
                stk.push(c);
            }
            else if(c == ')') {
                while(!stk.isEmpty() && stk.peek()!='(') {
                    res += stk.pop();
                }
                stk.pop();
            }
            //if the character is an operator
            else {
                while(!stk.isEmpty() && precedence(stk.peek())>=precedence(c)) { 
                    res += stk.pop();
                }
                stk.push(c);
            }
        }
        //emptying the stack
        while(!stk.isEmpty()) {
            res += stk.pop();
        }
        return res;
    }
}
