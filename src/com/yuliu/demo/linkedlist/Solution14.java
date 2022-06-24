package com.yuliu.demo.linkedlist;

import com.yuliu.bean.ListNode;

import java.util.ArrayList;
import java.util.Collections;

public class Solution14 {
    /**
     * @param head ListNode¿‡ the head
     * @return bool≤º∂˚–Õ
     */
    public boolean isPail(ListNode head) {
        // write code here
        ArrayList<Integer> list = new ArrayList();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        ArrayList<Integer> temp = (ArrayList<Integer>) list.clone();

        Collections.reverse(temp);

        for (int i = 0; i < temp.size(); i++) {
            int x = list.get(i);
            int y = temp.get(i);
            if (x != y)
                return false;
        }
        return true;
    }
}