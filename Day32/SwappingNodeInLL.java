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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null) return head;
        ListNode fromBeg = head;
        ListNode fromEnd = head;
        ListNode curr = head;
        int n = 0;
        while(curr != null) {
            curr = curr.next;
            n++;
        } 
        for(int i=1; i<k; i++) {
            fromBeg = fromBeg.next;
        }
        for(int i=1; i<n+1-k; i++) {
            fromEnd = fromEnd.next;
        }
        int temp = fromBeg.val;
        fromBeg.val = fromEnd.val;
        fromEnd.val = temp;

        return head;
    }
}
