package com.dsa.algorithms;

import java.util.Arrays;

public class FindLongestCommonSubsequence {

    public static String findLongestCommonSubbsequence(String s1, String s2) {
        int C[][] = new int[s1.length()+1][s2.length()+1];

        for (int i = 0; i <= s1.length(); i++) {
            Arrays.fill(C[i], 0);
        }

        for (int i = 1; i <= s1.length(); i++)
        {
            for (int j = 1; j <= s2.length(); j++)
            {
                if (s1.charAt(i-1) == s2.charAt(j-1))
                {
                    C[i][j] = C[i-1][j-1] + 1;
                }
                else
                {
                    C[i][j] = Math.max(C[i-1][j], C[i][j-1]);
                }
            }
        }

        String s = "";

        int i = s1.length();
        int j = s2.length();

        while ( i>0 && j>0)
        {
            if (s1.charAt(i-1) == s2.charAt(j-1))
            {
                s = s1.charAt(i-1) + s;
                i--;
                j--;
            }
            else
            {
                int side = C[i-1][j];
                int up = C[i][j-1];

                if (side > up)
                {
                    i = i-1;
                }
                else
                {
                    j = j-1;
                }
            }
        }

        return s;
    }
}
