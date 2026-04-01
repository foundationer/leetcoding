package org.phase5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.phase5.structures.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SortedArrayToBSTTest {

    private SortedArrayToBST sortedArrayToBST;

    @BeforeEach
    public void setUp() {
        sortedArrayToBST = new SortedArrayToBST();
    }

    @Test
    public void testEmptyArray() {
        TreeNode treeNode = sortedArrayToBST.sortedArrayToBST(new int[]{});

        assertNull(treeNode);
    }

    @Test
    public void testSingleElement() {
        TreeNode treeNode = sortedArrayToBST.sortedArrayToBST(new int[]{ 1 });

        assertEquals(1, treeNode.val);
        assertNull(treeNode.left);
        assertNull(treeNode.right);
    }

    @Test
    public void testMultipleElements() {
        TreeNode treeNode = sortedArrayToBST.sortedArrayToBST(new int[]{ -10, -3, 0,5, 9 });

        assertEquals(0, treeNode.val);
        assertEquals(-10, treeNode.left.val);
        assertEquals(-3, treeNode.left.right.val);
    }
}
