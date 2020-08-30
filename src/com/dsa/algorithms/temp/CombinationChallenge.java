package com.dsa.algorithms.temp;

public class CombinationChallenge {

    public static int noOfSolutions(int n)
    {
        String s = String.valueOf(n);
        return decode(s, s.length());
    }

    static int decode(String message, int len) {
        int i, w, ways[] = { 1, 0 };
        for(i = 0; i < len; ++i) {
            w = 0;
            if((i > 0) && ((message.charAt(i-1) == '1') || (message.charAt(i-1) == '2' && message.charAt(i) < '7'))) {
                w += ways[1];
            }
            if(message.charAt(i) > '0') {
                w += ways[0];
            }
            ways[1] = ways[0];
            ways[0] = w;
        }
        return ways[0];
    }
}


/*
1223

12 23
1 2 2 3
1 22 3
1 2 23

1 -> 1
12 ->
123

1 2 3 - a b c
1 23 - a x
12 3 - m c





 */