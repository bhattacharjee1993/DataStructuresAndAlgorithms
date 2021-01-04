package com.dsa.strings;

import java.util.Arrays;

public class FindLongestSubstring
{
    public static String findLongestSubstring(String s1, String s2)
    {

        int C[][] = new int[s1.length()+1][s2.length()+1];

        for (int i = 0; i< s1.length(); i++)
        {
            Arrays.fill(C[i], 0);
        }
        int max = -1;

        int maxI = 0;
        int maxJ = 0;

        for (int i = 1; i <= s1.length(); i++)
        {
            for (int j = 1; j <= s2.length(); j++)
            {
                if (s1.charAt(i-1) == s2.charAt(j-1))
                {
                    C[i][j] = C[i-1][j-1] + 1;
                    if (C[i][j] > max)
                    {
                        max = C[i][j];
                        maxI = i;
                        maxJ = j;
                    }
                }
            }
        }

        String s = "";
        while (maxI>0 && maxJ > 0 && C[maxI][maxJ] > 0)
        {
            if (C[maxI-1][maxJ-1] == (C[maxI][maxJ]-1) && s1.charAt(maxI-1) == s2.charAt(maxJ-1))
            {
                s = s1.charAt(maxI-1) + s;
                maxI = maxI-1;
                maxJ = maxJ -1;

            }
            else
            {
                maxJ--;
                maxI--;
            }
        }


        return s;
    }
}
