package com.dsa.algorithms;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingCharacter(String s)
    {
        int counts[] = new int[26];

        for (int i = 0; i < s.length(); i++)
        {
            counts[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i< s.length(); i++)
        {
            if (counts[s.charAt(i) - 'a'] == 1)
                return s.charAt(i);
        }

        return '0';
    }
}
