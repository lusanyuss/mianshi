package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;

public class Solution13 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param root TreeNode类
     * @return bool布尔型
     */

    int pre = Integer.MAX_VALUE;

//    public boolean isValidBST(TreeNode root) {

//        if (root == null) {
//            return true;
//        }
//
//        if (!isValidBST(root.left)) {
//            return false;
//        }
//
//        boolean isRootValidBST = (root.left != null && root.left.val >= root.val) || (root.right != null && root.right.val <= root.val);
//
//        boolean right = isValidBST(root.right);
//        return !isRootValidBST && left && right;
//    }
}