package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;

public class Solution16 {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     * @param root TreeNode��
     * @param p    int����
     * @param q    int����
     * @return int����
     */
    public int lowestCommonAncestor(TreeNode root, int p, int q) {
        // write code here
        if (root == null) {
            return -1;
        }
        if ((root.val >= p && root.val <= q) || (root.val >= q && root.val <= p)) {
            return root.val;
        } else if (root.val >= p && root.val >= q) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return lowestCommonAncestor(root.right, p, q);
        }


    }
}