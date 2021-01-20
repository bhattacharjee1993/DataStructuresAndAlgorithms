/**
 * You are given with an array which represents the denominations of coins available in a particular currency.
 * Now, we have to find out the minimum number of coins required to form a particular coinValue using those denomination coins.
 * We can assume that we have an unlimited supply of coins.
 *
 * Example : denominations: [ 1, 2, 4] , coinValue : 5
 * Output : 2 [ 4 x 1] + [ 1 x 1]
 *  We can form the value 5 using a minimum of 2 coins. One of value 4 and one of value 1.
 *
 * Input : denominations : [ 1, 5, 10] , coinValue : 7
 * Output : 3 [ 1 x 2 ] + [ 5 x 1] we can form using 2 coins of value 1 and 1 coin of value 5
 *
 */


package com.dsa.dynamicProgramming;

import java.util.Arrays;

public class MinimumNumberOfCoinsToFormDenomination {

    public static int findMinimumNumberOfCoinsToFormDenomination(int denominations[], int coinValue)
    {
        /**
         * Handling for basic cases
         */
        if (denominations == null || denominations.length == 0)
            return -1;


        int minValues[] = new int[coinValue + 1];

        /**
         * Here we are supposed to find the MINIMUM number of coins. Hence, we assign the entire array with MAX possible value and
         * we will compare at each step and only assign if the value we are trying to assign is less.
         */
        Arrays.fill(minValues, Integer.MAX_VALUE);

        /**
         * Now, for [1, 2, 4] , to make the value 5
         *            0     max     max     max     max     max
         *  minValues 0     1       2       3       4       5
         *
         *  Now, we take 1, we assign minValues[i] = min (minValues[i] , 1 + minValues[i-1] )
         *
         *                       0     1       2       3       4       5
         *             minValues 0     1       2       3       4       5
         *
         *  Now, we take 2, we assign minValues[i] = min (minValues[i] , 1 + minValues[i-2] )
         *          *
         *          *                       0     1       1       2       2       3
         *          *             minValues 0     1       2       3       4       5
         *
         *  Now, we take 4, we assign minValues[i] = min (minValues[i] , 1 + minValues[i-4] )
         *          *
         *          *                       0     1       2       3       1       2
         *          *             minValues 0     1       2       3       4       5
         *
         *   Hence, output is 2
         */

        /**
         * Handling for the base case, for value 0, the minValue is 0
         */
        minValues[0] = 0;

        for(int i = 0; i < denominations.length; i++)
        {
            for(int j = 1; j <= coinValue; j++)
            {
                if ( j >= denominations[i])
                {
                    /**
                     * we do the following because if we are attempting to add 1 to MAX_VAL, it will result in negative
                     */
                    int currentMinValueFormed = minValues[j - denominations[i]];;
                    if (minValues[j - denominations[i]] != Integer.MAX_VALUE)
                    {
                        currentMinValueFormed += 1;
                    }

                    minValues[j] = Math.min( minValues[j], currentMinValueFormed);
                }

            }
        }
        return minValues[coinValue] == Integer.MAX_VALUE ? -1 : minValues[coinValue];
    }
}
