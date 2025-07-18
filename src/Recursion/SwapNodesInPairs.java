//https://leetcode.com/problems/swap-nodes-in-pairs/description/?envType=problem-list-v2&envId=recursion

//24

//Medium

package Recursion;

public class SwapNodesInPairs {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {} ;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode curr = head;
        ListNode next = curr.next ;
        head = next;
        curr.next = swapPairs(next.next);
        next.next = curr;
        return head;

    }
}


/*Example 1:


Input: head = [1,2,3,4]

Output: [2,1,4,3]


Example 2:

Input: head = []

Output: []

Example 3:

Input: head = [1]

Output: [1]

Example 4:

Input: head = [1,2,3]

Output: [2,1,3]

 */