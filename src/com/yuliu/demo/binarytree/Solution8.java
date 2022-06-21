package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;

public class Solution8 {

    private boolean hasPathSum(TreeNode rootParam, int sum) {
        if (rootParam == null)
            return false;


        if (rootParam.left == null && rootParam.right == null && sum - rootParam.val == 0) {
            return true;
        }
        return hasPathSum(rootParam.left, sum - rootParam.val) || hasPathSum(rootParam.right, sum - rootParam.val);
    }
}