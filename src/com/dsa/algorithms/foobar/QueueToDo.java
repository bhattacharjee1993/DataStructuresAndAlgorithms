package com.dsa.algorithms.foobar;

import java.util.ArrayList;
import java.util.List;

public class QueueToDo {

    public static int solution(int start, int length)
    {
        List<Integer> results = new ArrayList<>();

        int diff = length;
        int value = start;

        while (diff > 0)
        {
            int i = value;
            int ctr = length;

            for ( ; i < value+diff; i++)
            {
                results.add(i);
                ctr--;
            }
            value = i;

            while (ctr > 0)
            {
                value++;
                ctr--;
            }
            diff--;
        }

        int xorVal = 0;

        for (int i : results)
        {
            xorVal = xorVal ^ i;
        }

        System.out.println(results.toString());

        return xorVal;
    }


    public static int solution1(int start, int length)
    {
        int result = 0;
        int check = length;

        for(int i = 0; i < length ;i++)
        {
            for (int j = 0; j < length; j++)
            {
                if (j < check)
                {
                    result = result ^ start;
                }
                start++;
            }
            System.out.println();
            check--;
        }
        return result;
    }


}
