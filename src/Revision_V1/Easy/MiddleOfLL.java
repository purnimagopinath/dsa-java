package Revision_V1.Easy;

import static Revision_V1.Easy.ListNode.printList;

//https://leetcode.com/problems/middle-of-the-linked-list/description/
public class MiddleOfLL {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        MiddleOfLL obj = new MiddleOfLL();
        ListNode newHead = obj.middleNode(node);

        printList(newHead);
    }
}
