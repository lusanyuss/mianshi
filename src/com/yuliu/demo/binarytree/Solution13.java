package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;

public class Solution13 {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     * @param root TreeNode��
     * @return bool������
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