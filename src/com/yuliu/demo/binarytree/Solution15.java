package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;

/**
 * ����һ�ýڵ���Ϊ n ���������жϸö������Ƿ���ƽ���������
 * ���������ֻ��Ҫ������ƽ���ԣ�����Ҫ�������ǲ������������
 * ƽ���������Balanced Binary Tree����
 * �����������ʣ�����һ�ÿ����������������������ĸ߶Ȳ�ľ���ֵ������1����������������������һ��ƽ���������
 */
public class Solution15 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right) && Math.abs(deep(root.left) - deep(root.right)) < 2;
    }

    public int deep(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(deep(root.left), deep(root.right)) + 1;
    }
}