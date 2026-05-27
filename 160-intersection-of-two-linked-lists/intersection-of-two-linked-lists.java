/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr1 = headA;
        ListNode curr2;
        while(curr1!=null){
            curr2 = headB;
            while(curr2!=null){
                if(curr2==curr1){
                    return curr2;
                }
                curr2 =curr2.next;
            }
            curr1=curr1.next;
        }
        return null;
    }
}