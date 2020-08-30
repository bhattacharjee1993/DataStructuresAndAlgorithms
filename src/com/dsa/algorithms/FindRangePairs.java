package com.dsa.algorithms;

public class FindRangePairs {
    public static String[] findRangePairs(int ar[])
    {
        int startIdx = 0;
        int endIdx = 0;
        int value = -1;

        String[] pairs = new String[ar.length];
        int ctr = 0;

        boolean lastInCurrentPair = false;

        for (int i = 0; i< ar.length - 1; i++)
        {
            if ( ar[i] + 1 == ar[i+1])
            {
                endIdx++;
                lastInCurrentPair = true;
            }
            else
            {
                lastInCurrentPair = false;
                if (startIdx == endIdx)
                {
                    pairs[ctr++] = ar[startIdx]+"";
                }
                else
                {
                    pairs[ctr++] = ar[startIdx] +" -> " + ar[endIdx];
                }
                startIdx = i+1;
                endIdx = i+1;

            }

        }

        if (lastInCurrentPair)
        {
            pairs[ctr++] = ar[startIdx] + "->" + ar[endIdx];
        }
        else
        {
            pairs[ctr++] = ar[ar.length-1]+"";
        }

        return pairs;
    }
}
