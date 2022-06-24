package com.yuliu.demo.linkedlist;

import com.yuliu.bean.ListNode;

public class Solution15 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode oddEvenList(ListNode head) {
        // write code here
        if (head == null) {
            return null;
        }

        ListNode even = head.next;
        ListNode odd = head;
        ListNode evenhead = even;

        while (even != null && even.next != null) {

            odd.next = even.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }

        odd.next = evenhead;
        return head;
    }
}