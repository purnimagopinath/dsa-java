package Revision_V1.Easy;



//https://leetcode.com/problems/linked-list-cycle/description/
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true; // compare references!
        }
        return false;
    }

    public static void main(String[] args){
        ListNode node = new ListNode(3);
        ListNode p = new ListNode(2);
        node.next = p;
        node.next.next = new ListNode(0);
        node.next.next.next = new ListNode(-4);
        node.next.next.next.next = p;

        LinkedListCycle obj = new LinkedListCycle();
        System.out.println("HAs cycle "+obj.hasCycle(node));
    }
}
