package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;

public class Solution12 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param pRoot TreeNode类
     * @return TreeNode类
     */
    public TreeNode Mirror(TreeNode pRoot) {
        // write code here
        if (pRoot == null) {
            return null;
        }

        TreeNode left = Mirror(pRoot.left);
        TreeNode right = Mirror(pRoot.right);

        pRoot.left = right;
        pRoot.right = left;
        return pRoot;
    }
}