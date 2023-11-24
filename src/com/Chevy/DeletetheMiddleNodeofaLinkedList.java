package com.Chevy;

public class DeletetheMiddleNodeofaLinkedList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {

    }

    public ListNode deleteMiddle(ListNode head) {

        if (head.next == null) {
            return null;
        }

        ListNode answer = head;
        ListNode dummy = head;

        int n = 0;

        while (dummy != null) {
            dummy = dummy.next;
            n++;
        }

        int middle = n / 2;


        for (int i = 0; i < middle; i++) {
            if (i == middle - 1) {
                answer.next = answer.next.next;
            }

            answer = answer.next;
        }

        return head;

    }
}
