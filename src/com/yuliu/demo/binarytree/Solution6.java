package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;


public class Solution6 {
    public int maxDepth(TreeNode root) {
        int height = depth(root);
        return height;
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = depth(root.left);
            int rightDepth = depth(root.right);
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

}