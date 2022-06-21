package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;

public class Solution17 {
    /**
     * @param root TreeNode类
     * @param o1   int整型
     * @param o2   int整型
     * @return int整型
     */
    public int lowestCommonAncestor(TreeNode root, int o1, int o2) {
        // write code here
        return helper(root, o1, o2).val;
    }


    public TreeNode helper(TreeNode root, int o1, int o2) {
        if (root == null) {
            return null;
        }
        if (root.val == o1 || root.val == o2) {
            return root;
        }

        TreeNode left = helper(root.left, o1, o2);
        TreeNode right = helper(root.right, o1, o2);


        if (left == null) {
            return right;
        }

        if (right == null) {
            return left;
        }

        return root;

    }
}