package com.yuliu.demo.linkedlist;

import com.yuliu.bean.ListNode;

public class Solution13 {
    public ListNode merge(ListNode pHead1, ListNode pHead2) {

        if (pHead1 == null) {
            return pHead2;
        }

        if (pHead2 == null) {
            return pHead1;
        }

        ListNode head = new ListNode(0);
        ListNode cur = head;


        while (pHead1 != null && pHead2 != null) {
            if (pHead1.val <= pHead2.val) {
                cur.next = pHead1;
                pHead1 = pHead1.next;
            } else {
                cur.next = pHead2;
                pHead2 = pHead2.next;
            }
        }
        if (pHead1 != null) {
            cur.next = pHead1;
        }else {
            cur.next = pHead2;
        }
        return head.next;
    }

    public ListNode sortInList(ListNode head) {
        // write code here
        if (head == null || head.next == null) {
            return head;
        }

        ListNode left = head;
        ListNode mid = head.next;
        ListNode right = head.next.next;

        while (right != null && right.next != null) {
            left = left.next;
            mid = mid.next;
            right = right.next.next;
        }

        left.next = null;


        return merge(sortInList(head), sortInList(mid));
    }


}