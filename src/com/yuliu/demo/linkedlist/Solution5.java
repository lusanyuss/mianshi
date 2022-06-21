package com.yuliu.demo.linkedlist;

import com.yuliu.bean.ListNode;

import java.util.ArrayList;

public class Solution5 {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        return divideMerge(lists,0,lists.size()-1);
    }

    public ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }
        ListNode node = new ListNode(-1);
        ListNode cur = node;
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                cur.next = list2;
                list2 = list2.next;

            } else {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }
        if (list1 != null) {
            cur.next = list1;
        } else {
            cur.next = list2;
        }

        return node.next;
    }


    public ListNode divideMerge(ArrayList<ListNode> lists, int left, int right) {
        if (left == right) {
            return lists.get(left);
        }
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        return merge(divideMerge(lists, left, mid),divideMerge(lists, mid + 1, right));
    }

}