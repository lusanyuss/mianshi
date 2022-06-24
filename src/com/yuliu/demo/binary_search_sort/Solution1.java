package com.yuliu.demo.binary_search_sort;

public class Solution1 {
    /**
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     *
     * @param nums   int����һά����
     * @param target int����
     * @return int����
     */
    public int search(int[] nums, int target) {
        // write code here
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid]>target){
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return -1;
    }
}