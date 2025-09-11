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
    public void reorderList(ListNode head) {
        if(head==null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = null;
        ListNode safe = null;
        while(slow!=null){
            safe = slow.next;
            slow.next = rev;
            rev = slow;
            slow = safe;
        }
        ListNode first= head;
        ListNode second = rev;
        while(second != null){
        ListNode tmp1 = first.next;
        ListNode tmp2 = second.next;

        first.next = second;
        second.next = tmp1;

        first = tmp1;
        second = tmp2;
    }

    if(first != null) {
        first.next = null;
    }

    }
}