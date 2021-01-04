package com.dsa.arrays;

import javafx.util.Pair;

public class FindLongestSubArrayBySum {

    public static int findLongestSubArrayBySum(int ar[], int sum)
    {
        Pair<Integer,Integer> pair = new Pair<>(0,0);
        int currentSum =0;

        for (int windowStart = 0, windowEnd = 0; windowEnd< ar.length && windowStart < ar.length; )
        {
            currentSum += ar[windowEnd];
            while (windowStart < windowEnd && currentSum > sum)
            {
                currentSum -= ar[windowStart++];
            }

            if (currentSum == sum && (pair.getValue() - pair.getKey() < (windowEnd+1) - windowStart))
            {
                pair = new Pair<>(windowStart, windowEnd+1);
            }
            windowEnd++;
        }

        return pair.getValue() - pair.getKey();
    }
}
