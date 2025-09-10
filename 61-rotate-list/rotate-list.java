class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Count the length
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Adjust k
        k = k % count;
        if (k == 0) return head;

        // Dummy node for ease
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Move prev to (count - k)th node
        for (int i = 0; i < count - k; i++) {
            prev = prev.next;
        }

        // Break list
        ListNode curr = prev.next;
        prev.next = null;

        // Attach end to head
        ListNode ans = curr;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = dummy.next;

        return ans;
    }
}
