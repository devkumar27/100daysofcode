class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] c1 = new int[200];
        int[] c2 = new int[200];
        for(int i=0; i<s.length(); i++) {
            if(c1[s.charAt(i)] != c2[t.charAt(i)]) {
                return false;
            }
            c1[s.charAt(i)] = i+1;
            c2[t.charAt(i)] = i+1;
        }
        return true;
    }
}
