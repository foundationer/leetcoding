package org.phase5.structures;

public class ListBuilder {

    public static ListNode buildList(int[] values) {
        ListNode head = new ListNode(values[0]);
        ListNode iterator = head;
        for (int i = 1; i < values.length; i++) {
            iterator.next = new ListNode(values[i]);
            iterator = iterator.next;
        }
        return head;
    }
}
