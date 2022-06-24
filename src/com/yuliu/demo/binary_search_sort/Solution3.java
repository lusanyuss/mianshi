package com.yuliu.demo.binary_search_sort;

public class Solution3 {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     * @param nums int����һά����
     * @return int����
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