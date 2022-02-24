package com.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{2,1,4,2,6,6}));
    }


    private static int numIdenticalPairs(int[] nums) {
        int pairs=0;
        Map<Integer,Integer> counts = new HashMap<>();
        for (int num : nums) {
            int count = counts.getOrDefault(num, 0);
            pairs += count;
            counts.put(num, ++count);
        }
      return pairs;
    }
}
