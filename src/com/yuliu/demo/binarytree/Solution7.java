package com.yuliu.demo.binarytree;

import com.yuliu.bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;


public class Solution7 {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode roots) {
        // write code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (roots == null) {
            return result;
        }

        LinkedList<TreeNode> mLinkList = new LinkedList<TreeNode>();
        mLinkList.add(roots);


        while (mLinkList.size() != 0) {
            int mLenght = mLinkList.size();
            ArrayList<Integer> listVar = new ArrayList<>();

            for (int i = 0; i < mLenght; i++) {
                TreeNode treeNodeVar = mLinkList.removeFirst();
                listVar.add(treeNodeVar.val);

                if (treeNodeVar.left != null) {
                    mLinkList.addLast(treeNodeVar.left);
                }
                if (treeNodeVar.right != null) {
                    mLinkList.addLast(treeNodeVar.right);
                }
            }
            result.add(listVar);
        }

        return result;
    }


    public ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        LinkedList<TreeNode> linkedListVar = new LinkedList();
        linkedListVar.add(root);
        boolean isLeft = true;

        while (!linkedListVar.isEmpty()) {

            int length = linkedListVar.size();
            ArrayList<Integer> listVar = new ArrayList<>();

            for (int iVar = 0; iVar < length; iVar++) {
                TreeNode nodeVar = linkedListVar.removeFirst();
                if (isLeft) {
                    listVar.add(nodeVar.val);
                } else {
                    listVar.add(0, nodeVar.val);
                }
                if (nodeVar.left != null) {
                    linkedListVar.add(nodeVar.left);
                }
                if (nodeVar.right != null) {
                    linkedListVar.add(nodeVar.right);
                }
            }
            isLeft = !isLeft;
            result.add(listVar);
        }
        return result;
    }

}