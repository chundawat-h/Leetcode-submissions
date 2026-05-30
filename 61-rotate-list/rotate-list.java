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
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode curr=head;
        int l =0;
        while(curr!=null){
            curr = curr.next;
            l++;
        }
        k = k %l;
        while(k > 0){
            curr = head;
            while(curr!=null && curr.next!=null&& curr.next.next!=null){
                curr = curr.next;
            }
            curr.next.next = head;           
            head = curr.next;
            curr.next = null;
            k--;
        }
        return head;
    }
}