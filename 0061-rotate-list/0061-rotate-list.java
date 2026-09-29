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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        int length = 0;

        while (temp != null) {
            temp = temp.next;
            length++;
        }

        k = k % length;

        if (k == 0) {
            return head;
        }

        k = length - k;

        int c = 1;
        ListNode t = head;

        while (c < k) {
            t = t.next;
            c++;
        }

        ListNode b = t.next;
        t.next = null;

        ListNode a = b;

        while (a.next != null) {
            a = a.next;
        }

        a.next = head;

        return b;
    }
}