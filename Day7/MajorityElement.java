//LC-169 - https://leetcode.com/problems/majority-element/description/
import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {
        int num = 0;
        int count = 0;
        int n = nums.length;
        for(int i=0; i<n; i++) {
            if(count == 0) {
                count = 1;
                num = nums[i];
            }
            else if(num == nums[i]) {
                count++;
            }
            else {
                count--;
            }
        }

        count = 0;
        for(int i=0; i<nums.length; i++) {
            if(num == nums[i]) {
                count++;
            }
        }
        if(count > (n/2)) {
            return num;
        }
        return -1;
    }
}
