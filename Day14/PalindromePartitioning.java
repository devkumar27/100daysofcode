// LC131 - https://leetcode.com/problems/palindrome-partitioning/

class Solution {
    public boolean isPalindrome(String s, int beg, int end) {
        while(beg<=end) {
            if(s.charAt(beg) != s.charAt(end)) {
                return false;
            }
            beg++;
            end--;
        }
        return true;
    }
    public void helper(String s, int ind, List<String> subs, List<List<String>> res) {
        if(ind == s.length()) {
            res.add(new ArrayList<>(subs));
            return;
        }
        
        for(int i=ind; i<s.length(); i++) {
            if(isPalindrome(s, ind, i)) {
                subs.add(s.substring(ind, i+1));
                helper(s, i+1, subs, res);
                subs.remove(subs.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> subs = new ArrayList<>();
        helper(s, 0, subs, res);
        return res;
    }
}
