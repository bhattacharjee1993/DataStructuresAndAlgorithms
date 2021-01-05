/**

 ======= PROBLEM STATEMENT =======
 You are given with an array of integers from range 1 to N where N is the size of the array.
 - The array is not necessarily sorted.
 - There can be multiple duplicate numbers. We are supposed to return the first duplicate number.
 - If the array doesn't have any duplicate numbers,then we return -1.
 - The time complexity must be Linear, and Space complexity should be constant

 Example:

Input : [ 1, 2, 2, 3, 4]
Output : 2 [ as 2 is the first and only duplicate in the array]

Input : [ 1, 1, 2, 2, 3, 4]
Output : 1 [ as 1 is the first duplicate in the array]

Input : [ 1, 2, 3, 4]
Output : -1 [ as there are no duplicates in the array]

 ======= HINT =======
 Notice the most important thing here is the space complexity needs to be constant. Hence, we cannot use another array. Or a map like structure.
 Another important thing to notice here is the array contains integers of range till the size of the array

 */

package com.dsa.arrays;

public class FindFirstDuplicate {

    public static int findFirstDuplicate(int[] ar)
    {
        /**
         * Handling for the edge cases is the first thing
         */
        if (ar == null)
            return -1;
        //Iterating through the length of the array
        for (int i = 0; i< ar.length; i++)
        {
            /**
             * Let's assume the input to be : [ 1, 2, 2, 3, 4 ]
             *
             * Now for Iteration 0:
             *      ar[ ar[0] ] < 0 => ar[1] < 0 is false and then we make ar[1] = -2   entire array [ 1, -2, 2, 3, 4 ]
             *     for Iteration 1:
             *      ar[ ar[1] ] < 0 => ar[2] < 0 is false and then we make ar[2] = -2   entire array [ 1, -2, -2, 3, 4 ]
             *     for Iteration 2:
             *      ar[ ar[2] ] < 0 => ar[2] [this is the reason we use Math.abs]  < 0 and this is true, we return ar[2] which is 2   
             */
            if (ar[Math.abs(ar[i]) - 1] < 0  )
                return Math.abs(ar[i]);
            else {
                ar[Math.abs(ar[i])-1] = -1 * ar[Math.abs(ar[i])-1];
            }
        }

        return -1;
    }
}
