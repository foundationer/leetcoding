package org.phase5;

import org.phase5.structures.tree.TreeNode;

public class MaximumDepth {

    public int maxDepth(TreeNode root) {
        return (root == null) ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
