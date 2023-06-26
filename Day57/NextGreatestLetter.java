class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target >= letters[letters.length-1]) {
            return letters[0];
        }
        int beg = 0;
        int end = letters.length - 1;
        int mid = 0;
        while(beg <= end) {
            mid = beg + (end - beg)/2;
            if(letters[mid] > target) {
                end = mid-1;
            } 
            else {
                beg = mid+1;
            }
            
        }
        return letters[beg];
    }
}
