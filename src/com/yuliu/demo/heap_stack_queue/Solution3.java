package com.yuliu.demo.heap_stack_queue;

import java.util.HashMap;
import java.util.Stack;

public class Solution3 {
    /**
     * @param s string×Ö·û´®
     * @return bool²¼¶ûÐÍ
     */
    public boolean isValid(String s) {
        // write code here
        HashMap<Character, Character> map = new HashMap<>();

        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.toCharArray().length; i++) {
            char c = s.charAt(i);
            if (map.containsValue(c)) {
                stack.push(c);
                continue;
            }
            if (map.containsKey(c)) {
                if (!stack.isEmpty() && map.get(c) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}