package com.yuliu.demo.linkedlist;

import com.yuliu.bean.ListNode;

public class Solution7 {

    public ListNode EntryNodeOfLoop(ListNode head) {
        ListNode slow = hasCycle(head);
        if (slow == null) {
            return null;
        }

        ListNode fast = head;

        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    private ListNode hasCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }


}