package com.yuliu.demo.heap_stack_queue;

import java.util.Stack;

public class Solution2 {

    //����ջ��push �� pop
    Stack<Integer> s1 = new Stack<Integer>();
    //���ڴ洢��Сmin
    Stack<Integer> s2 = new Stack<Integer>();

    public void push(int node) {
        s1.push(node);
        if (s2.isEmpty() || s2.peek() > node) {
            s2.push(node);
        } else {
            s2.push(s2.peek());
        }
    }

    public void pop() {
        s1.pop();
        s2.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return s2.peek();
    }
}