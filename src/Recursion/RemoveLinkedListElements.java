//https://leetcode.com/problems/remove-linked-list-elements/description/?envType=problem-list-v2&envId=recursion

//203

//Easy

package Recursion;

public class RemoveLinkedListElements {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {} ;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        if(head.val != val){
            ListNode temp = head;
            temp.next = removeElements(head.next, val);
            return temp;
        }else{
            return removeElements(head.next, val);
        }


    }

}

/*Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

Example 2:

Input: head = [], val = 1
Output: []

Example 3:

Input: head = [7,7,7,7], val = 7
Output: []

 */