package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;

import java.util.LinkedList;

public class Solution14 {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     * @param root TreeNode��
     * @return bool������
     */
    public boolean isCompleteTree(TreeNode root) {
        // write code here
        if (root == null)
            return true;

        LinkedList<TreeNode> deque = new LinkedList();
        deque.offer(root);

        boolean isTag = false;
        while (!deque.isEmpty()) {
            TreeNode treeNode = deque.poll();
            if (treeNode == null) {
                isTag = true;
                continue;
            }
            if (isTag) {
                return false;
            }
            deque.offer(treeNode.left);
            deque.offer(treeNode.right);
        }

        return true;
    }
}