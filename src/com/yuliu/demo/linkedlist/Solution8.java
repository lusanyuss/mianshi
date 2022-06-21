package com.yuliu.demo.linkedlist;

import com.yuliu.bean.ListNode;

public class Solution8 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param pHead ListNode类
     * @param k     int整型
     * @return ListNode类
     */
    public ListNode FindKthToTail(ListNode pHead, int k) {
        // write code here
        ListNode node1 = pHead;
        ListNode node2 = pHead;


        for (int i = 0; i < k; i++) {
            if (node1 != null) {
                node1 = node1.next;
            } else {
                return null;
            }
        }

        while (node1 != null) {
            node1 = node1.next;
            node2 = node2.next;
        }

        return node2;
    }
}