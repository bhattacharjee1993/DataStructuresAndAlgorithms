/**

 ======= PROBLEM STATEMENT =======
 You are given with an array of integers in random order and in any range between -2^32 to (2^32-1),
 - The array is not necessarily sorted.
 - There can be multiple duplicate numbers.
 - The array can contain negative numbers
 You are supposed to return the minimum value of X, which should be atleast 1.
 X is such that, when X is added to any number in the array, the cumulative sum of the array, starting from the left is greater than or equal to 1

 For example:
 For input array : [ 3, -6,  5,  -2,  1 ]

 The value of X is 4 because:

    4   +   3   =   7
    7   +  (-6) =   1
    1   +   5   =   6
    6   +  (-2) =   4
    4   +   1   =   5
 Hence, from above, we can see that the cumulative sum, starting from left is always >= 1.
 Now, we chose 4 because it is the minimum number to satisfy the above condition.

 Let's try X=3
    3   +   3   =   6
    6   +  (-6) =   0   <==== Running sum becomes 0 here. Hence, 3 is not valid.

 Hence, output = 4

 Input: [ -5, 4, -2, 3, 1]
 Output : 6


 ======= HINT =======
 If we try solving the problem by taking X as a variable and if we try to establish an algebraic equation, we can move towards a solution.

 */
package com.dsa.arrays;

public class FindMinimumXToMakeArrayPositive {

    public static int findMinValueOfX(int[] ar)
    {
        /**
         * Handling for base cases
         */
        if (ar == null || ar.length == 0)
            return 1;
        /**
         * Taking X = 1, because that is the minimum possible value.
         */
        int x = 1;

        /**
         * Now for the array, [ 3,  -6,   5,    -2,     1 ]
         *
         * Taking the number  X = 1,
         *
         * runningSum = 0
         *
         *  runningSum  =   runningSum     +      ar[i]
         *              =      0           +        3        =      3
         *              =      3           +      ( -6 )     =      -3  <<=== -3 < 1, hence we assign x = max (x, abs(-3) + 1) = 4 [we take abs value because to make -3 to 1, we add abs(3) + 1]
         *              =     -3           +        5        =      2
         *              =      2           +      ( -2 )     =      0   <<=== 0 < 1, hence we assign x = max (x, abs(-2) + 1) = max ( 4, 3) = 4
         *              =      0           +        1        =      1
         *
         *  Hence, after the iteration, the value of x is 4.
         *  Thus, we return 4.
         */

        int runningSum = 0;
        for (int i = 0; i < ar.length; i++)
        {
            runningSum += ar[i];

            if (runningSum < 1)
            {
                x = Math.max(x, (Math.abs(runningSum) + 1));
            }
        }
        return x;
    }
}
