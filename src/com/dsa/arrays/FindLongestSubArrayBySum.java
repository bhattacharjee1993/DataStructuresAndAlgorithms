/**

 ======= PROBLEM STATEMENT =======
 You are given with an array of integers in random order and in any range between -2^32 to (2^32-1), and a targetSum
 - The array is not necessarily sorted.
 - There can be multiple duplicate numbers.
 - You are supposed to return the length of the longest SubArray that can be formed with the given targetSum
 - If there are 2 subArrays with the largest Length to form the targetSum, then return the first subArray

 Example:

 Input : array : [ 1, 2, 2, 3, 4], targetSum : 5
 Output : 3 [ the following SubArrays form a sum of 5. [1,2,2] and [2,3]. Among the 2, the subArray [1,2,2] has a length of 3. Hence, we return it]

 Input : array : [ 5, 4, 4, 2, 3, 8], targetSum : 13
 Output : 4 [ the following SubArrays form a sum of 13. [5,4,4] and [4,4,2,3]. Among the 2, the subArray [4,4,2,3] has a length of 4. Hence, we return it]

 Input : array : [ 1, 2, 3, 4], targetSum : 12
 Output : 0 [ as there are no subArrays forming a sum of 12]

 Input: array : [2,3,4,4,3,2,1] , targetSum : 13
 Output: 4 [the following SubArrays form a sum of 13. [2,3,4,4] and [4,4,3,2]. Both are of length 4. Hence, we return 4]

 Input: array : [1, 2, 3, 4] , targetSum : 1
 Output: 1 [the following SubArrays form a sum of 1. [1].  Hence, we return 1]

 ======= HINT =======
 By looking at the problem, we can easily derive that we are supposed to deal with a window or a range. We have to return the length of the max SubArray.
 Hence, this is a classic example of a Sliding window Problem.

 */

package com.dsa.arrays;

import javafx.util.Pair;

public class FindLongestSubArrayBySum {

    public static int findLongestSubArrayBySum(int ar[], int targetSum)
    {

        /**
         * Handling for edge cases of input
         */
        if (ar == null)
            return 0;
        /**
         * We initialize a pair to store the startIndex and endIndex of the subArray found so far with the max Length.
         */
        Pair<Integer,Integer> pair = new Pair<>(0,0);

        /**
         * the following variable is to contain the running sum
         */
        int currentSum =0;

        /**
         * For example, ar = [ 5,   4,  4,  2,  3,  5]      targetSum =  13
         *
         * Initially, windowStart = 0
         *            windowEnd = 0
         *
         * Iteration 1:
         *          currentSum = 5
         *          0 < 0 && 5 > 13 => both are false hence while loop doesn't get executed
         *          5 == 13 is false hence if doesn't get executed
         *          windowEnd = 1
         *          pair = empty
         * Iteration 2:
         *          currentSum = 9
         *          0 < 1 && 9 > 13 false hence while loop doesn't get executed
         *          9 == 13 is false hence if doesn't get executed
         *          windowEnd = 2
         *          pair = empty
         *
         * Iteration 3:
         *          currentSum = 13
         *          0 < 2 && 13 > 13 is false hence while loop doesn't get executed
         *          13 == 13 && 0 < ((2+1) - 0) is true hence if gets executed.
         *              pair = (0, 3)
         *          windowEnd = 3
         *
         * Iteration 4:
         *          currentSum = 15
         *          0 < 3 && 15> 13 is true
         *              currentSum = 10
         *              windowStart = 1
         *           1 < 3 && 10 > 13 is false and while loop breaks
         *           10 == 13 is false and if doesn't get executed
         *           windowEnd = 4
         *           pair= (0,3)
         * Iteration 5:
         *          currentSum = 13
         *          1< 5 && 13 == 13 is false and while loop doesn't get executed.
         *          13 == 13 && (3-0) < ( (4+1) - 1) is true => Here we actually override the previousMax of length 3 by currentMax of length 4
         *              pair = (1,5)
         */
        for (int windowStart = 0, windowEnd = 0; windowEnd< ar.length && windowStart < ar.length; )
        {
            currentSum += ar[windowEnd];
            while (windowStart < windowEnd && currentSum > targetSum)
            {
                currentSum -= ar[windowStart++];
            }

            if (currentSum == targetSum && (pair.getValue() - pair.getKey() < (windowEnd+1) - windowStart))
            {
                pair = new Pair<>(windowStart, windowEnd+1);
            }
            windowEnd++;
        }

        System.out.println();
        for (int i = pair.getKey(); i < pair.getValue(); i++) {
            System.out.print(ar[i] + "\t");
        }
        System.out.println();
        return pair.getValue() - pair.getKey();
    }
}
