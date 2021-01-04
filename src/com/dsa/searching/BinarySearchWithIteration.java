package com.dsa.searching;

public class BinarySearchWithIteration {

    public static int performBinarySearch(int ar[], int element)
    {
        int low = 0;
        int high = ar.length - 1;
        int mid = -1;

        while (low <= high)
        {
            mid = (low+high)/2;
            if (ar[mid] == element)
            {
                return mid+1;
            }
            else if (ar[mid] < element)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        return -1;
    }
}
