package com.yuliu.bean;

public class Solution {
    public static void main(String[] args) {
        TreeNode treeNode8 = new TreeNode(8, null, null);
        TreeNode treeNode9 = new TreeNode(9, null, null);
        TreeNode treeNode10 = new TreeNode(10, null, null);
        TreeNode treeNode11 = new TreeNode(11, null, null);
        TreeNode treeNode12 = new TreeNode(12, null, null);
        TreeNode treeNode13 = new TreeNode(13, null, null);
        TreeNode treeNode14 = new TreeNode(14, null, null);
        TreeNode treeNode15 = new TreeNode(15, null, null);


        TreeNode treeNode4 = new TreeNode(4, treeNode8, treeNode9);
        TreeNode treeNode5 = new TreeNode(5, treeNode10, treeNode11);
        TreeNode treeNode6 = new TreeNode(6, treeNode12, treeNode13);
        TreeNode treeNode7 = new TreeNode(7, treeNode14, treeNode15);

        TreeNode treeNode2 = new TreeNode(2, treeNode4, treeNode5);
        TreeNode treeNode3 = new TreeNode(3, treeNode6, treeNode7);

        TreeNode treeNode1 = new TreeNode(1, treeNode2, treeNode3);

        dfs(treeNode1);

    }

    public static void dfs(TreeNode root) {
        if (root != null) {
            System.out.print(root.val+"   ");
            dfs(root.left);
            dfs(root.right);
        }
    }
}