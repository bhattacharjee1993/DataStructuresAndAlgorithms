/**
 * Write a function to take in an array of positive integers and return the max sum of a subset that can be formed in the array without taking the adjacent elements.
 * - The goal is to find the max sum of a subset.
 * - The subset should not contain adjacent elements from the array
 * - If the array is empty, return 0
 *
 * Input : [ 2, 5, 10, 9]
 * Output : 14 [formed with [5,9], other valid subsets were [2,10], [2,9] ]
 *
 * Input : [ 70 ,80, 90, 100, 50, 60 ]
 * Output : 240 [ formed with [ 80, 100, 60]
 *
 * Input : [ 30, 25, 50, 55, 100, 120 ]
 * Output : 205
 *
 * Input : [70]
 * Output: 70
 *
 * Input : [70, 80]
 * Output : 80
 */

package com.dsa.dynamicProgramming;

public class MaxSubsetSumNoAdjacent {

    /**
     *
     * @param array
     * @return maxSubsetSum of the array using no adjacent elements
     *
     * This has TimeComplexity O(n) and SpaceComplexity O(n)
     */
    public static int findMaxSumOfSubsetExcludingAdjacent_NotFullyOptimized(int[] array)
    {
        /**
         * We have to check for basic scenarios first
         */
        if (array == null || array.length == 0)
            return 0;

        /**
         * Now how do we achieve it?
         * Can we iterate through the array and take a call by achieving the maxSum that can be formed at a particular index?
         * The answer is we can. But how?
         * With the help of a formula.
         *
         * Say for example, if we consider R as an array of maxSums at particular indexes.
         *
         * for an array ar,
         *
         * R[0] = array[0]
         * R[1] = max(array[0], array[1])
         *
         * R[i] = max ( R[i-1] , R[i-2] + array[i] ) <= Because, at a particular index, the max Sum is the sum formed till the previous index. Or the sum formed till
         *                                              i-2 and we add the ith element. keeping in mind of adjacency here.
         *
         *
         * for example,
         * [ 80, 70, 100, 120 ]
         *
         * R[0] = 80
         * R[1] = 80 [ max of 80 and  70 ]
         *
         * R[2] = max ( R[0] + 100 , R[1] )
         *      = max ( 180, 80 )
         *      = 180
         *
         * R[3] = max ( R[1] + 120 , R[2] )
         *      = max ( 200, 180 )
         *      = 200
         * Hence, 200 is the max sum
         *
         */
        if (array.length == 1)
            return array[0];

        if (array.length == 2)
            return Math.max(array[0], array[1]);

        int R[] = new int[array.length];

        R[0] = array[0];
        R[1] = Math.max(array[0], array[1]);

        for(int i = 2; i < array.length; i++)
        {
            R[i] = Math.max(R[i-1], R[i-2] + array[i]);
        }
        return R[array.length-1];
    }

    public static int findMaxSumOfSubsetExcludingAdjacent(int array[])
    {
        //check for null
        if(array == null || array.length == 0)
            return 0;

        if (array.length == 1)
            return array[0];

        if (array.length == 2)
            return Math.max(array[0], array[1]);

        /**
         * We do the same thing as mentioned above.
         * If you look closely at the above method, the only two values that we required at a particular point was:
         * - R[i-1]
         * - R[i-2]
         * Now, calling R[i-1] as firstVal
         * and R[i-2] as secondVal
         */
        int secondVal = array[0];
        int firstVal = Math.max(array[0], array[1]);

        for (int i = 2; i < array.length; i++)
        {
            int temp = Math.max(firstVal, secondVal + array[i]);
            /**
             * R[i-1] in current iteration becomes R[i-2] in the next iteration/
             * Also, R[i] becomes R[i-1] in next iteration
             * Hence, the step below
             */
            secondVal = firstVal;
            firstVal = temp;
        }

        return firstVal;
    }
}
