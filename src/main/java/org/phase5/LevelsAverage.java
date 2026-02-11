package org.phase5;

import org.phase5.structures.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelsAverage {

    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) return List.of();
        Queue<TreeNode> queue = new LinkedList<>(List.of(root));
        List<Double> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            double length = queue.size();
            double row = 0;
            for (int i = 0; i < length; i++) {
                TreeNode currentNode = queue.poll();
                row += currentNode.val;
                if (currentNode.left != null) queue.offer(currentNode.left);
                if (currentNode.right != null) queue.offer(currentNode.right);
            }
            result.add(row/length);
        }
        return result;
    }
}
