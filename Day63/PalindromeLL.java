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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        Stack<Integer> stk = new Stack<>();
        ListNode temp = head;
        while(temp != null) {
            stk.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(temp != null) {
            if(stk.pop() != temp.val) {
                return false;
            }
            temp = temp.next;
        }
        return true;        
    }
}
