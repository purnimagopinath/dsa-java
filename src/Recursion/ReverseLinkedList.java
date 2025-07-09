//https://leetcode.com/problems/reverse-linked-list/?envType=problem-list-v2&envId=recursion

//206

//Easy

package Recursion;

public class ReverseLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {} ;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}

/*
Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:

Input: head = [1,2]
Output: [2,1]

Example 3:

Input: head = []
Output: []

 */

