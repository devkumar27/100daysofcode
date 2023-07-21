class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<Integer>();
        for(int i=0; i<asteroids.length; i++) {
            boolean flag = true;
            while(!stk.empty() && (stk.peek() > 0 && asteroids[i] < 0)) {
                if(Math.abs(asteroids[i]) > Math.abs(stk.peek())) {
                    stk.pop();
                    continue;
                }
                else if(Math.abs(asteroids[i]) == Math.abs(stk.peek())) {
                    stk.pop();
                    flag = false;
                }
                flag = false;
                break;
            }
            if(flag) {
                stk.push(asteroids[i]);
            }
        }
        int[] res = new int[stk.size()];
        for(int i=res.length-1; i>=0; i--) {
            res[i] = stk.pop();
        }
        return res;
    }
}
