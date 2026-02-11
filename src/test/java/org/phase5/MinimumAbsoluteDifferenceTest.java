package org.phase5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.phase5.structures.MinimumAbsoluteDifference;
import org.phase5.structures.tree.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumAbsoluteDifferenceTest {

    private MinimumAbsoluteDifference minimumAbsoluteDifference;

    @BeforeEach
    public void setUp() {
        minimumAbsoluteDifference = new MinimumAbsoluteDifference();
    }

    @Test
    public void minimumAbsoluteDifferenceOfEmptyTree() {
        int difference = minimumAbsoluteDifference.getMinimumDifference(null);
        assertEquals(Integer.MAX_VALUE, difference);
    }

    @Test
    public void minimumAbsoluteDifferenceOfRoot() {
        int difference = minimumAbsoluteDifference.getMinimumDifference(new TreeNode(1));
        assertEquals(Integer.MAX_VALUE, difference);
    }

    @Test
    public void minimumAbsoluteDifference() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int difference = minimumAbsoluteDifference.getMinimumDifference(root);
        assertEquals(1, difference);
    }

    @Test
    public void minimumAbsoluteDifference2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(48);
        root.left.left = new TreeNode(12);
        root.left.right = new TreeNode(49);

        int difference = minimumAbsoluteDifference.getMinimumDifference(root);
        assertEquals(1, difference);
    }

    @Test
    public void minimumAbsoluteDifference3() {
        TreeNode root = new TreeNode(236);
        root.left = new TreeNode(104);
        root.right = new TreeNode(701);
        root.left.right = new TreeNode(227);
        root.right.right = new TreeNode(911);

        int difference = minimumAbsoluteDifference.getMinimumDifference(root);
        assertEquals(9, difference);
    }
}
