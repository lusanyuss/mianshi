package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;

import java.util.LinkedList;

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