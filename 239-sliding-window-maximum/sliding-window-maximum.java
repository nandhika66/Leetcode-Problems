class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {		
		if (a == null || k <= 0) {
			return new int[0];
		}
		int n = a.length;
		int[] ans = new int[n-k+1];
		int r = 0;
		Deque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < a.length; i++) {
			while (!q.isEmpty() && q.peek() < i - k + 1) {
				q.poll();
			}
			while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
				q.pollLast();
			}
			q.offer(i);
			if (i >= k - 1) {
				ans[r] = a[q.peek()];
                r++;
			}
		}
		return ans;
	}
}
/* 
Before adding a new element:

Remove elements that are outside the current window.

Remove all elements smaller than the current element from the back,
because they can never become maximum again.

Insert the current element into the deque.

The element at the front of the deque is always the maximum of the current window.

Once the first window of size k is formed, record the front element as the answer.
*/