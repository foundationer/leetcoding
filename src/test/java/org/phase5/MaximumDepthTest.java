package org.phase5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.phase5.structures.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDepthTest {

    private MaximumDepth maximumDepth;

    @BeforeEach
    public void setUp() {
        maximumDepth = new MaximumDepth();
    }

    @Test
    public void testMaximumDepthOfEmptyTree() {
        assertEquals(0, maximumDepth.maxDepth(null));
    }

    @Test
    public void testMaximumDepthOfSingleRoot() {
        assertEquals(1, maximumDepth.maxDepth(new TreeNode(1)));
    }

    @Test
    public void testMaximumDepthOfSimpleTree() {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);

        assertEquals(2, maximumDepth.maxDepth(root));
    }

    @Test
    public void testMaximumDepthOfComplexTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        assertEquals(3, maximumDepth.maxDepth(root));
    }
}
