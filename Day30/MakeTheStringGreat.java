class Solution {
    public String makeGood(String s) {
        if(s.length() == 1) return s;
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(!stk.isEmpty() && s.charAt(i) == (stk.peek()^32)) {
                stk.pop();
            }
            else {
                stk.push(s.charAt(i));
            }
        }
        String greatStr = "";
        while(!stk.isEmpty()) {
            greatStr = stk.pop() + greatStr;
        }

        return greatStr;
    }
}
