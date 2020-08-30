package com.dsa.algorithms.strings;

public class LongestPalindromicSubstring {
    public static String findLongestPalindromeString(String s)
    {
        if (s == null)
            return "";
        int start = 0;
        int end = 0;

        for (int i = 0; i< s.length(); i++)
        {
            int len1 = findPalindromeLength(s,i,i);
            int len2 = findPalindromeLength(s,i,i+1);

            int len = Math.max(len1,len2);

            if (len > (end - start))
            {
                start = i - ((len-1)/2);
                end = i + ((len)/2);
            }
        }

        return s.substring(start, end+1);

    }

    public static int findPalindromeLength(String s, int left, int right)
    {
        if (s == null || s.length() == 0 || left > right)
            return 0;
        while (left >= 0 && right >= 0 && left < s.length() && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }

        return right - left -1;
    }
}
