package org.phase5.structures.tree;

import org.phase5.structures.linkedlist.ListNode;

public class TreeBuilder {

    public static TreeNode buildTree(int[] values) {
        TreeNode root = new TreeNode(values[0]);
        TreeNode iterator = root;
        for (int i = 1; i < values.length; i++) {
            //iterator.next = new ListNode(values[i]);
            //iterator = iterator.next;
        }
        return root;
    }
}
