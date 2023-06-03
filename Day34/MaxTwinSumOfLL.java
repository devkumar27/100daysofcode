/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        Stack<Integer> stk = new Stack<>();
        ListNode counter = head;
        ListNode curr = head;
        int n = 0;
        while(counter != null) {
            n++;
            counter = counter.next;
        }
        for(int i=0; i<n/2; i++) {
            stk.push(curr.val);
            curr = curr.next;
        }
        int maxSum = 0;
        for(int i=0; i<n/2; i++) {
            int currSum = stk.pop() + curr.val;
            maxSum = Math.max(currSum, maxSum);
            curr = curr.next;
        }
        return maxSum;
    }
}
