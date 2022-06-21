package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;

public class Solution15 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right) && Math.abs(deep(root.left) - deep(root.right)) < 2;
    }

    public int deep(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(deep(root.left), deep(root.right)) + 1;
    }
}