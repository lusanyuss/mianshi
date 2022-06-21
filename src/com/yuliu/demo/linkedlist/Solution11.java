package com.yuliu.demo.linkedlist;

import com.yuliu.bean.ListNode;

public class Solution11 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode head1 = pHead1;
        ListNode head2 = pHead2;

        while (head1 != null && head2 != null) {
            head1 = head1.next;
            head2 = head2.next;
        }

        if (head2 == null) {
            while (head1 != null) {
                pHead1 = pHead1.next;
                head1 = head1.next;
            }
        }


        if (head1 == null) {
            while (head2 != null) {
                pHead2 = pHead2.next;
                head2 = head2.next;
            }
        }

        while (pHead2 != pHead1) {
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;
    }
}