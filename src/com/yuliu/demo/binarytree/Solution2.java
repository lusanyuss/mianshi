package com.yuliu.demo.binarytree;

import java.util.HashSet;

class Solution2 {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> setVar = new HashSet<Character>();
        int n = s.length();
        int rk = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            rk = i;
            setVar.clear();
            while (rk < n && !setVar.contains(s.charAt(rk))) {
                setVar.add(s.charAt(rk));
                rk++;
            }
            ans = Math.max(ans, rk - i);
        }
        return ans;

    }
}