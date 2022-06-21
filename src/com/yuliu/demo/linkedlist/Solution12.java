package com.yuliu.demo.linkedlist;

import com.yuliu.bean.ListNode;

public class Solution12 {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(9);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(7);

        ListNode head2 = new ListNode(6);
        head2.next = new ListNode(3);

        ListNode result = addInList(head1, head2);
        System.out.println("sss");
    }

    public static ListNode addInList(ListNode head1, ListNode head2) {
        // write code here

        ListNode mhead1 = reverse(head1);
        ListNode mhead2 = reverse(head2);
        int jinwei = 0;

        ListNode pre = null;
        ListNode mhead = null;
        //        ListNode result = pre;

        while (mhead1 != null || mhead2 != null) {
            int value1 = mhead1 != null ? mhead1.val : 0;
            int value2 = mhead2 != null ? mhead2.val : 0;

            int weizhi = value1 + value2 + jinwei;

            if (weizhi >= 10) {
                jinwei = 1;
                weizhi = weizhi - 10;
            } else {
                jinwei = 0;
            }
            if (pre == null) {
                pre = new ListNode(weizhi);
                mhead = pre;
            } else {
                pre.next = new ListNode(weizhi);
                pre = pre.next;
            }

            if (mhead1 != null) {
                mhead1 = mhead1.next;
            }
            if (mhead2 != null) {
                mhead2 = mhead2.next;
            }
        }

        if (jinwei == 1) {
            pre.next = new ListNode(1);
            pre = pre.next;
        }
        return reverse(mhead);
    }


    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

}