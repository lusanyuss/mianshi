package com.yuliu.demo.binary_search_sort;

public class Solution2 {
    public boolean Find(int target, int[][] array) {

        if (array.length == 0) {
            return false;
        }
        if (array[0].length == 0) {
            return false;
        }
        int x = array.length - 1;
        int y = 0;
        while (x >= 0 && y <= array[0].length - 1) {
            if (array[x][y] > target) {
                x--;
            } else if (array[x][y] < target) {
                y++;
            } else {
                return true;
            }
        }
        return false;
    }
}