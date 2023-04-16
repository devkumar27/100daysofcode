//Leetcode 28 - Find the Index of the First Occurrence in a String
class Solution {
    public int strStr(String haystack, String needle) {
        int i=0; 
        for(int j=0; j<haystack.length(); j++) {
            if(needle.charAt(i) == haystack.charAt(j)) {
                i++;
            }
            else {
                j = j-i;
                i=0;
            }
            if(i==needle.length()) {
                return j-needle.length()+1;
            }
        }
        return -1;
    }
}
