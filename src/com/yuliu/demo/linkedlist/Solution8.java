package com.yuliu.demo.linkedlist;

import com.yuliu.bean.ListNode;

public class Solution8 {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     * @param pHead ListNode��
     * @param k     int����
     * @return ListNode��
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