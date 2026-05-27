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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        ListNode res;
        if(l1!=null && l2!=null){
            sum = l1.val+l2.val;
            carry = sum/10;
            sum = sum%10;
            res = new ListNode(sum);
            l1=l1.next;
            l2=l2.next;
        }
        else{
            if(l1!=null) return l1;
            if(l2 != null) return l2;
            return null;
        }
        ListNode ct = res;
        sum =0;
        while(l1!=null || l2!=null){
            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
            sum+=carry;
            carry = sum/10;
            sum = sum%10;
            ListNode temp = new ListNode(sum);
            ct.next = temp;
            ct = ct.next;
            sum=0;
        }
        if (carry!=0){
            ListNode temp = new ListNode(carry);
            ct.next = temp;
        }
        return res;
    }
}