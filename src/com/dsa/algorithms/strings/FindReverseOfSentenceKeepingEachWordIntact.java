package com.dsa.algorithms.strings;

public class FindReverseOfSentenceKeepingEachWordIntact {

    public static String reverseSentence(String s)
    {
        String rev = "";


        s = s.trim();

        int lp = s.length() - 1;
        int fp = s.length();

        while (lp >= 0)
        {
            if (s.charAt(lp) == ' ')
            {
                rev += s.substring(lp+1, fp) + " ";

                fp = lp;
            }
            lp = lp -1;
        }

        rev += s.substring(0, fp);
        return rev;
    }
}
