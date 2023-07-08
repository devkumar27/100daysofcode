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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
        ListNode start = new ListNode();
        start.next = head;
        ListNode ptr1 = start;
        ListNode ptr2 = start;
        int diff = 1;
        while(ptr2.next != null) {
            if(diff <= n) {
                ptr2 = ptr2.next;
                diff++;
            }
            else {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
        }
        ptr1.next = ptr1.next.next;
        return start.next;
    }
}
