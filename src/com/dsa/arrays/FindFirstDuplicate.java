package com.dsa.arrays;

public class FindFirstDuplicate {

    public static int findFirstDuplicate(int ar[])
    {
        for (int i = 0; i< ar.length; i++)
        {
            if (ar[Math.abs(ar[i]) - 1] < 0  )
                return Math.abs(ar[i]);
            else {
                ar[Math.abs(ar[i])-1] = -1 * ar[Math.abs(ar[i])-1];
            }
        }

        return -1;
    }
}
