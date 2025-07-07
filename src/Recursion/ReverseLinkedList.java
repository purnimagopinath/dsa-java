//https://leetcode.com/problems/reverse-linked-list/?envType=problem-list-v2&envId=recursion

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


