package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;

import java.util.LinkedList;

/**
 * 给定一个二叉树，确定他是否是一个完全二叉树。
 * 完全二叉树的定义：若二叉树的深度为 h，除第 h 层外，
 * 其它各层的结点数都达到最大个数，第 h 层所有的叶子结点都连续集中在最左边，
 * 这就是完全二叉树。（第 h 层可能包含 [1~2h] 个节点）
 */
public class Solution14 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param root TreeNode类
     * @return bool布尔型
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