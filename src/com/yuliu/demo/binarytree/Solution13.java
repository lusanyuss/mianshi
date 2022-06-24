package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;

/**
 * ����һ�����������ڵ㣬�����ж�������ǲ��Ƕ�����������
 */
public class Solution13 {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     * @param root TreeNode��
     * @return bool������
     */

    int pre = Integer.MIN_VALUE;

    //�������
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        //�Ƚ���������
        if (!isValidBST(root.left))
            return false;
        if (root.val < pre)
            return false;
        //������ֵ
        pre = root.val;
        //�ٽ���������
        return isValidBST(root.right);
    }
}