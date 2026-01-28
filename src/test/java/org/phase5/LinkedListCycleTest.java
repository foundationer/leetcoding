package org.phase5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.phase5.structures.ListBuilder;
import org.phase5.structures.ListNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListCycleTest {

    private LinkedListCycle cycle;

    @BeforeEach
    public void setUp() {
        this.cycle = new LinkedListCycle();
    }

    @Test
    public void emptyList() {
        assertFalse(cycle.hasCycle(null));
    }

    @Test
    public void oneNodeWithoutCycle() {
        ListNode head = new ListNode(1);

        assertFalse(cycle.hasCycle(head));
    }

    @Test
    public void twoNodesWithCycle() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;

        assertTrue(cycle.hasCycle(head));
    }

    @Test
    public void fourNodesWithCycle() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        assertTrue(cycle.hasCycle(head));
    }

    @Test
    public void repeatedElementsWithoutCycle() {
        int[] values = { -21, 10, 17, 8, 4, 26, 5, 35, 33, -7, -16, 27, -12, 6, 29, -12, 5, 9, 20, 14, 14, 2, 13, -24, 21, 23, -21, 5 };
        ListNode head = ListBuilder.buildList(values);

        assertFalse(cycle.hasCycle(head));
    }
}
