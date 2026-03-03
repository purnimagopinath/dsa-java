package Revision_V1.Easy;
//https://leetcode.com/problems/reverse-linked-list/

import static Revision_V1.Easy.ListNode.printList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode temp = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }

    public static void main(String[] args){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        ReverseLinkedList obj = new ReverseLinkedList();
        ListNode newHead = obj.reverseList(node);

        printList(newHead);
    }
}


/*Iterative version:

public ListNode reverseListIterative(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while(curr != null){
        ListNode nextTemp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextTemp;
    }
    return prev;
}
 */