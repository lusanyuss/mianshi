package com.yuliu.demo.binarytree;

import java.util.PriorityQueue;

class Solution4 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
        for (int n : nums) {
            heap.add(n);
        }
        for (int i=0;i<nums.length-k;i++){
            heap.poll();
        }
        return heap.poll();
    }
}