package com.yuliu.demo.heap_stack_queue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution4 {

    PriorityQueue<Integer> maxQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
    ArrayList<Integer> result = new ArrayList<>();

    public ArrayList<Integer> maxInWindows(int[] num, int size) {

        if (num == null || num.length <= 0 || size < 1 || size > num.length) {
            return result;
        }

        int count = 0;
        for (; count < size; count++) {
            maxQueue.offer(num[count]);
        }


        while (count < num.length) {
            result.add(maxQueue.peek());
            maxQueue.remove(num[count - size]);
            maxQueue.add(num[count]);
            count++;

        }
        result.add(maxQueue.peek());
        return result;
    }
}