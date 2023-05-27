// https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1
class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<x.length(); i++) {
            char curr = x.charAt(i);
            if(curr == '(' || curr == '[' || curr == '{') {
                stk.push(curr);
            }
            else {
                if(stk.isEmpty()) return false;
                char ch = stk.pop();
                if((ch == '(' && curr == ')') || (ch == '[' && curr == ']') || (ch == '{' && curr == '}')) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}
