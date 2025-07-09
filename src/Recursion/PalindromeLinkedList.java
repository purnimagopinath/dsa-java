//https://leetcode.com/problems/palindrome-linked-list/description/?envType=problem-list-v2&envId=recursion

//234
//Easy

package Recursion;

public class PalindromeLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {} ;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }


        ListNode second = reverse(slow);
        ListNode first = head;


        while (second != null) {
            if (first.val != second.val) return false;
            first = first.next;
            second = second.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    //not recursive

}

/*
Example 1:

Input: head = [1,2,2,1]
Output: true

Example 2:

Input: head = [1,2]
Output: false

 */
