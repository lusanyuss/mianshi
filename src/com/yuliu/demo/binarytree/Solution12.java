package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;

public class Solution12 {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     * @param pRoot TreeNode��
     * @return TreeNode��
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