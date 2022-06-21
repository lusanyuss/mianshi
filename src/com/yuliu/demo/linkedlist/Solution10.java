package com.yuliu.demo.linkedlist;

import com.yuliu.bean.ListNode;

public class Solution10 {
    /**
     * @param head ListNode类
     * @param n    int整型
     * @return ListNode类
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write code here
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode cur = head;
        ListNode fast = head;
        ListNode pre = res;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            pre = cur;
            cur = cur.next;
        }

        pre.next = cur.next;
        return res.next;
    }
}