package com.yuliu.demo.linkedlist;

import com.yuliu.bean.ListNode;

public class Solution2 {
    /**
     * 例如：
     * 给出的链表为 1\to 2 \to 3 \to 4 \to 5 \to NULL1→2→3→4→5→NULL, m=2,n=4m=2,n=4,
     * 返回 1\to 4\to 3\to 2\to 5\to NULL1→4→3→2→5→NULL.
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write code here
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode prev = node;

        for (int i = 0; i < m - 1; i++) {
            prev = prev.next;
        }

        ListNode rightNode = prev;

        for (int i = 0; i < n - m + 1; i++) {
            rightNode = rightNode.next;
        }

        ListNode leftNode = prev.next;
        ListNode cur = rightNode.next;

        prev.next = null;
        rightNode.next = null;


        reverseLinkedList(leftNode);

        prev.next = rightNode;
        leftNode.next = cur;

        return node.next;

    }

    private void reverseLinkedList(ListNode leftNode) {
        ListNode prev = null;
        ListNode cur = leftNode;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
    }
}