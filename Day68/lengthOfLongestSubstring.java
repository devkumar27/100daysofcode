class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int left = 0, right = 0;
        int n = s.length();
        int longestLen = 0;
        while(right < n) {
            if(map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            longestLen = Math.max(longestLen, right-left+1);
            right++;
        }

        return longestLen;
    }
}
