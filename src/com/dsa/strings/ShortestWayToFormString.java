package com.dsa.strings;


/**
 * Given a source and target string, find the number of subsequences that source needs to form target.
 * suppose,
 * source = abc
 * target = abcbc
 *
 * output should be 2
 * because abcbc can be formed by abc + bc [from source]
 *
 * for source = abc target = abcdbc, return -1 as d is not contained in the string
 *
 */
public class ShortestWayToFormString {

    public static int findShortestWay(String source, String target)
    {
        String remaining = target;
        int srcPtr = 0;
        int targetPtr = 0;

        int numOfSubsequences = 0;

        while (remaining.length() > 0)
        {
            String sub = "";
            srcPtr = 0;
            targetPtr = 0;
            while (srcPtr < source.length() && targetPtr < remaining.length())
            {
                if (source.charAt(srcPtr++) == remaining.charAt(targetPtr)) {
                    sub += remaining.charAt(targetPtr);
                    targetPtr++;
                }
            }
            if (sub.isEmpty() )
            {
                return -1;
            }

            numOfSubsequences++;
            remaining = remaining.substring(sub.length());
        }
        return numOfSubsequences;
    }
}
