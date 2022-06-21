package com.yuliu.demo.linkedlist;

import com.yuliu.bean.ListNode;

public class Solution3 {
    /**
     * @param head ListNode类
     * @param k    int整型
     * @return ListNode类
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        // write code here
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode pre = node;

        while (head != null) {
            ListNode tail = head;
            for (int i = 0; i < k - 1; i++) {
                tail = tail.next;
                if (tail == null) {
                    return node.next;
                }
            }
            ListNode cur = tail.next;


            pre.next = null;
            tail.next = null;

            reverse(head);

            pre.next = tail;
            head.next = cur;
            pre = head;
            head = cur;
        }
        return node.next;

    }

    private void reverse(ListNode head) {
        ListNode pre = null;
        ListNode mcur = head;
        while (mcur != null) {
            ListNode temp = mcur.next;
            mcur.next = pre;
            pre = mcur;
            mcur = temp;
        }
    }
}