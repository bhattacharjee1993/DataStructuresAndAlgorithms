/**
 * Write a program to find the number of ways to make a denomination value using some given denominations coins.
 * Eg:
 * Let's assume we have coins of value : [ 1, 5, 10]
 * And, we are supposed to make a denomination value of 10
 *
 * We can do this in 4 ways :
 * [ 1 x 10] - 10 of value 1 coins
 * [1 x 5 + 5 x 1]  5 of value 1 coins and 1 of value 5 coins
 * [2 x 5] 2 of value 5 coins
 * [10 x 1] 1 of value 10 coin
 *
 * We can assume that there is unlimited supply of coins of a particular denomination
 *
 *
 * Input: [1, 5, 10] ; denominationValue : 10
 * Output : 4
 *
 * Input : [ 1, 5 ] ; denominationValue: 6
 * Output : 2  [ [1 x 6] , [ 1 x 1  +  5 x 1 ]
 *
 * HINT:
 * This is a ways problem. We can get the ways at i-1 th place to determine the one in ith place.
 * Let's think of it as a dynamic programming problem
 */


package com.dsa.dynamicProgramming;

public class NumberOfWaysToMakeCoinDenomination {

    public static int findNumberOfWaysToFormDenomination(int denominationValue, int[] availableDenoms)
    {
        /**
         * Handling for base cases
         */
        if (availableDenoms == null || availableDenoms.length == 0)
            return 0;
        /**
         * We will construct the array to get to the final value.
         * We will start with 0 and proceed to the denominationValue
         */
        int possibleWays[] = new int[denominationValue + 1];

        /**
         * Base case, because 0 can be formed using no coins. Number of ways: 1
         */
        possibleWays[0] = 1;

        /**
         * input: [1,2,4], value : 4
         *               1  0   0   0   0
         * possibleWays  0  1   2   3   4
         *
         * Now, taking value as 1, possibleWays[i] += possibleWays[i-1]
         *
         *                  1  1   1   1   1
         *    possibleWays  0  1   2   3   4
         *
         *  Now, taking value as 2, possibleWays[i] += possibleWays[i-2]
         *
                         1  1   2   2   3
         * possibleWays  0  1   2   3   4
         *
         * Now, taking value as 4, possibleWays[i] += possibleWays[i-4]
         *
                         1  1   2   2   4
         * possibleWays  0  1   2   3   4
         *
         *
         * Hence, output is 4
         */

        for (int i = 0; i < availableDenoms.length; i++)
        {
            for (int j = 0; j < possibleWays.length; j++)
            {
                if ( j >= availableDenoms[i])
                {
                    possibleWays[j] += possibleWays[j - availableDenoms[i]];
                }
            }
        }

        return possibleWays[denominationValue];
    }
}
