package com.yuliu.demo.binarytree;

import com.yuliu.bean.ListNode;

class Solution3 {

    public static ListNode reverseKGroup(ListNode head, int k) {


        ListNode x = new ListNode(0);
        ListNode x1 = x;
        ListNode x2 = head;
        x.next = head;


        while (x2 != null) {
            ListNode y1 = x1;
            for (int iVar = 0; iVar < k; iVar++) {
                y1 = y1.next;
                if (y1 == null) {
                    return x.next;
                }
            }
            ListNode y2 = y1.next;
            //½»»»
            ListNode[] listNodesVar = myReverse(x2, y1);

            x2 = listNodesVar[0];
            y1 = listNodesVar[1];
            x1.next = x2;
            y1.next = y2;

            x1 = y1;
            x2 = y2;
        }
        return x.next;
    }

    private static ListNode[] myReverse(ListNode x2, ListNode y1) {
        ListNode[] result = new ListNode[2];
        ListNode prev = null;
        ListNode p = x2;
        while (prev != y1) {
            ListNode nex = p.next;
            p.next = prev;
            prev = p;
            p = nex;
        }
        result[0] = prev;
        result[1] = x2;
        return result;

    }




}