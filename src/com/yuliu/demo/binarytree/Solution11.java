package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;

public class Solution11 {
    /**
     * @param t1 TreeNode¿‡
     * @param t2 TreeNode¿‡
     * @return TreeNode¿‡
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        // write code here
        if (t1 == null && t2 == null) {
            return null;
        }

        if (t1 != null && t2 == null) {
            return t1;
        }

        if (t1 == null && t2 != null) {
            return t2;
        }
        TreeNode node = new TreeNode(t1.val + t2.val);
        node.left = mergeTrees(t1.left, t2.left);
        node.right = mergeTrees(t1.right, t2.right);
        return node;
    }
}