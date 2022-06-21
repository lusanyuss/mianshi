package com.yuliu.demo.linkedlist;

import com.yuliu.bean.ListNode;

public class Solution6 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = new ListNode(-1);
        slow.next = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}