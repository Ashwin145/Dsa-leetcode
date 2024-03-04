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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode firstptr = dummy;
        ListNode secondptr = dummy;

        //Move secondptr n spaces ahead
        for(int i=0;i<n;i++){
            secondptr = secondptr.next;
        }    
        //Move both now,until the next of secondptr is null
        while(secondptr.next!=null){
            firstptr = firstptr.next;
            secondptr = secondptr.next;
        }
        //We now have to remove the node next of firstptr
        firstptr.next = firstptr.next.next;
        return dummy.next;


    }
}