package com.yuliu.demo.linkedlist;

import com.yuliu.bean.ListNode;

public class Solution16 {
    /**
     * @param head ListNode¿‡
     * @return ListNode¿‡
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write code here
        if (head == null) {
            return null;
        }
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode curr = res;


        while (curr.next != null && curr.next.next != null) {
            if (curr.next.val == curr.next.next.val) {
                int temp = curr.next.val;
                while (curr.next != null && curr.next.val == temp) {
                    curr.next = curr.next.next;
                }
            } else {
                curr = curr.next;
            }
        }
        return res.next;
    }
}