class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head, fast = head;

        // Step 1: Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Skip middle node if list has odd number of nodes
        if (fast != null) {
            slow = slow.next;
        }

        // Step 3: Reverse second half
        ListNode reversed = rev(slow);
        ListNode firstHalf = head;

        // Step 4: Compare both halves
        while (reversed != null) {
            if (firstHalf.val != reversed.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            reversed = reversed.next;
        }

        return true;
    }

    private ListNode rev(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
