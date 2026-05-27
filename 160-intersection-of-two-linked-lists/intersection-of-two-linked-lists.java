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
        ListNode curr2 = headB;
        Set<ListNode> st = new HashSet<>();
        while(curr1!=null || curr2!=null){
            if(curr1 != null){
                if( st.contains(curr1)) return curr1;
                st.add(curr1);
                curr1=curr1.next;
            }
            if(curr2 != null){
                if( st.contains(curr2)) return curr2;
                st.add(curr2);
                curr2= curr2.next;
            }            
        }
        return null;
    }
}