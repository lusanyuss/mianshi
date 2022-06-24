package com.yuliu.demo.binary_search_sort;

public class Solution3 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param nums int整型一维数组
     * @return int整型
     */
    public int findPeakElement(int[] nums) {
        // write code here
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }

        if (nums[0] > nums[1]) {
            return 0;
        }

        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }

        for (int i = 2; i < nums.length; i++) {
            int first = nums[i - 2];
            int second = nums[i - 1];
            int third = nums[i];

            if (first < second && second > third) {
                return i - 1;
            }
        }
        return -1;
    }
}