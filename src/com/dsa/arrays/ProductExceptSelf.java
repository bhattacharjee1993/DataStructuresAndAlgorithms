/**

 ======= PROBLEM STATEMENT =======
 You are given with an array of integers in random order and in any range between -2^32 to (2^32-1),
 - The array is not necessarily sorted.
 - There can be multiple duplicate numbers.
 You are supposed to return an array that will contain the product of all the numbers in the array except that number

 Example:

 Input : array : [ 1,   2,  2,  3,  4]
 Output :        [ 48, 24, 24, 16, 12] [ So for 0th position, we have 2 * 2 * 3 * 4 = 48,
                                        For output[1] , we have 1 * 2 * 3 * 4,
                                            output[2] = 1 * 2 * 3 * 4,
                                            output[3] = 1 * 2 * 2 * 4,
                                            output[4] = 1 * 2 * 2 * 3 ]

 Input : array : [  1,  2, 3, 4 ]
 Output :        [ 24, 12, 8, 6 ]


 ======= HINT =======
 By looking at the problem, it may look very simple at the beginning, because we might think of multiplying all the numbers
 and then continuously keep on dividing by the ith position number.
 But that can lead to out of range issues.
 Also, it can be asked that you are not supposed to use the division operator.

 One approach would be for any number, productExceptSelf = (product of all elements to the left of i) * (product of all elements to the right of i)

 */
package com.dsa.arrays;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] ar)
    {
        /**
         * Handling for basic cases
         */
        if (ar == null || ar.length == 0)
            return null;

        /**
         * Creating the output array to store the result
         */
        int[] output = new int[ar.length];

        /**
         * We will proceed, by populating output[i] = (product of all elements to left of i => Here storing it as M)
         * Then once M is evaluated, we have (product of all elements to left of an index) in output.
         *
         * For input, [ 1, 2, 3, 4, 5 ]
         *              0  1  2  3  4
         * we will have initially, [ 1, 1, 2, 6, 24 ] in output
         *
         * for iteration 1 : M = ar[0] * M = 1 * 1  = 1
         *                   output= [ 1, 1, 0, 0, 0 ]
         *
         * for iteration 2 : M = ar[1] * M = 2 * 1  = 2
         *                  output= [ 1, 1, 2, 0, 0 ]
         *
         * for iteration 3 : M = ar[2] * M = 3 * 2  = 6
         *                  output= [ 1, 1, 2, 6, 0 ]
         *
         * for iteration 4 : M = ar[3] * M = 4 * 6  = 24
         *                  output= [ 1, 1, 2, 6, 24 ]
         *
         * Then we proceed to multiply all elements to right of an index.
         * We do that by starting from (n-2)th position, n being the size of array. Here also, we will use M
         *
         *
         *  for iteration i=3 : M = ar[4] * M = 5 * 1  = 5
         *                   output= [ 1, 1, 2, 6*5, 24 ] => [ 1, 1, 2, 30, 24 ]
         *
         * for iteration i=2 : M = ar[3] * M = 4 * 5  = 20
         *                  output= [ 1, 1, 2*20, 30, 24 ] => [ 1, 1, 40, 30, 24 ]
         *
         * for iteration i=1 : M = ar[2] * M = 3 * 20  = 60
         *                  output= [ 1, 1*60, 40, 30, 24 ] => [ 1, 60, 40, 30, 24 ]
         *
         * for iteration i=0 : M = ar[1] * M = 2 * 60  = 120
         *                  output= [ 1*120, 60, 40, 30, 24 ] => [ 120, 60, 40, 30, 24 ]
         *
         * then we will have output as:  [       120, 60, 40, 30, 24]
         *
         *
         *
         *
         * Initializing the first element to 1, because for
         */
        output[0] = 1;
        int M = 1;
        for(int i=1;i<ar.length;i++)
        {
            M = ar[i-1] * M;
            output[i] = M;
        }

        M=1;
        for (int i=ar.length-2;i>=0;i--)
        {
            M = ar[i+1]*M;
            output[i] *= M;
        }
        /**
         * Time Complexity:
         * We traverse the array twice.
         * Hence, O(n + n) where n is the size of the array, hence O(n)
         *
         * Space complexity: O(n) [for the output array]
         */

        return output;
    }
}
