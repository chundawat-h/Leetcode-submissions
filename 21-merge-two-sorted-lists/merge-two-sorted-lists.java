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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ret;
        
        if(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                ret= list1;
                list1= list1.next;
            }
            else {
                ret= list2;
                list2 = list2.next;
            }
        }
        else{
            if(list1==null) return list2;
            else return list1;
        }
        ListNode res = ret;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                res.next = list1;
                list1 = list1.next;
            }
            else {
                res.next = list2;            
                list2 = list2.next;
            }
            res = res.next;
        }
        if(list1!=null){
            res.next = list1;
        }
        if(list2!=null){
            res.next = list2;
        }
        return ret;
    }
}