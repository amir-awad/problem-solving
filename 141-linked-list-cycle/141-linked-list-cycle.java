/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //put the addresses of nodes in a HashSet and check if we passed by any node twice
        HashSet<ListNode> hs = new HashSet<ListNode>();
        ListNode curr=head;
        
        while(curr!=null){
            if(hs.contains(curr))
                return true;
            hs.add(curr);
            curr=curr.next;
        }
        
        return false;
        
    }
    
}
