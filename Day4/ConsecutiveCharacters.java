//LC 1446
class Solution {
    public int maxPower(String s) {
        if(s.length() == 1) {
            return 1;
        }
        int maximum = 0;
        int tempMax = 1;
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                tempMax++;
            }
            else {
                tempMax = 1;
            }
            maximum = Math.max(tempMax, maximum);
        }
        return maximum;
    }
}
