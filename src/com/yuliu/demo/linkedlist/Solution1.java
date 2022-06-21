package com.yuliu.demo.linkedlist;

import com.yuliu.bean.ListNode;

/**
 * BM1 ·´×ªÁ´±í
 */
public class Solution1 {
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}