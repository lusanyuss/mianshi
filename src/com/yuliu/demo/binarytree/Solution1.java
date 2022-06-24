package com.yuliu.demo.binarytree;

import com.yuliu.bean.ListNode;

class Solution1 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }


    public static boolean isPalindromeString_recursive(String s) {
        int start = 0;
        int end = s.length() - 1;
        if (end <= start) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return isPalindromeString_recursive(s.substring(start + 1).substring(0, end - 1));
    }

    public static boolean isPalindromeString(String s) {
        if (s == null) {
            return true;
        }
        if (s.length() == 1) {
            return true;
        }

        int start = 0;
        int end = s.length() - 1;

        while (start > end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}