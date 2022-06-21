package com.yuliu.demo.linkedlist;

import com.yuliu.bean.ListNode;

public class Solution4 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(-1);
        ListNode pre = node;
        while (list1 != null || list2 != null) {
            if (list1 == null && list2 != null) {
                pre.next = list2;
                pre = pre.next;
                list2 = list2.next;
            } else if (list1 != null && list2 == null) {
                pre.next = list1;
                pre = pre.next;
                list1 = list1.next;
            } else {
                if (list1.val >= list2.val) {
                    pre.next = list2;
                    pre = pre.next;
                    list2 = list2.next;
                } else {
                    pre.next = list1;
                    pre = pre.next;
                    list1 = list1.next;
                }
            }
        }
        return node.next;
    }
}