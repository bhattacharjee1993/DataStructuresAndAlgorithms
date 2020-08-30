package com.dsa.algorithms.strings;

import java.util.HashSet;

public class LongestCommonSubstringWithNonRepeatingCharacters {

    public static String findLongestCommonSubstringWithNonRepeatingCharacters(String src)
    {
        int start = 0;
        int end = 0;
        String res = "";

        HashSet<Character> set = new HashSet<>();
        while (end < src.length())
        {
            if (!set.contains(src.charAt(end)))
            {
                set.add(src.charAt(end));
                end++;
                res = src.substring(start,end).length() > res.length() ? src.substring(start,end) : res ;
            }
            else
            {
                set.remove(src.charAt(start));
                start++;
            }
        }
        return res;
    }
}
