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
    ListNode left;
    public boolean isPalindrome(ListNode head) {
        left = head;
        return check(head);
        
    }
    private boolean check(ListNode right){
        //base case
        if(right==null){
            return true;
        }
        //go till the end of list
        boolean res = check(right.next);
        //if already false stop further checking
        if(!res){
            return false;
        }
        //compare left and right
        if(left.val!=right.val){
            return false;
        }
        left = left.next;
        return true;
    }
}