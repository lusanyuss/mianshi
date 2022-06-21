package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;

public class Solution10 {
    public boolean isSymmetrical(TreeNode pRoot) {
        return recursion(pRoot.left,pRoot.right);
    }


    public boolean recursion(TreeNode root1, TreeNode root2) {
        if (root1 == null && root1 == null) {
            return true;
        }
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }
        return recursion(root1.left, root2.right) && recursion(root1.right, root2.left);
    }
}