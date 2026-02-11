package org.phase5.structures;

import org.phase5.structures.tree.TreeNode;

import java.util.TreeSet;

public class MinimumAbsoluteDifference {

    private final TreeSet<Integer> nodes = new TreeSet<>();

    private int result = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return result;

        if (!nodes.isEmpty()) {
            Integer floor = nodes.floor(root.val);
            if(floor != null) {
                result = Math.min(result, root.val - floor);
            }
            Integer ceiling = nodes.ceiling(root.val);
            if(ceiling != null) {
                result = Math.min(result, ceiling - root.val);
            }
        }
        nodes.add(root.val);
        getMinimumDifference(root.left);
        getMinimumDifference(root.right);
        return result;
    }
}
