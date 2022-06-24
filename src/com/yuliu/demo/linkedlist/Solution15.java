package com.yuliu.demo.linkedlist;

import com.yuliu.bean.ListNode;

public class Solution15 {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     * @param head ListNode��
     * @return ListNode��
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