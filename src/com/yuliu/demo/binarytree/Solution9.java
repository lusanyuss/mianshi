package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;

public class Solution9 {


    TreeNode pre = null;
    TreeNode head = null;
    public TreeNode Convert(TreeNode root) {
        if (root == null) {
            return null;
        }
        Convert(root.left);
        if (head == null) {
            head = root;
            pre = root;
        } else {
            pre.right = root;
            root.left = pre;
            pre = root;
        }
        Convert(root.right);
        return head;
    }
}