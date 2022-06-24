package com.yuliu.demo.heap_stack_queue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution5 {
    PriorityQueue<Integer> mQueue = new PriorityQueue<>((o1, o2) -> o1 - o2);
    ArrayList<Integer> result = new ArrayList<>();

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if (input == null || input.length <= 0 || k < 1 || k > input.length) {
            return result;
        }

        for (int i : input) {
            mQueue.add(i);
        }

        for (int i = 0; i < k; i++) {
            result.add(mQueue.poll());
        }

        return result;
    }
}