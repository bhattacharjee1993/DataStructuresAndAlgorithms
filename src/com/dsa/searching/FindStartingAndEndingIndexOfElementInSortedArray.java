package com.dsa.searching;

public class FindStartingAndEndingIndexOfElementInSortedArray {

    public static void findIndicesOfElement(int ar[], int element)
    {
        int left = findStartIndexOfElement(ar,element);
        int right = findEndIndexOfElement(ar, element);

        System.out.println("left: "+left +"right: " +right );
    }

    private static int findEndIndexOfElement(int[] ar, int element) {
        int left = 0;
        int right = ar.length - 1;

        int mid = -1;

        while (left <= right)
        {
            mid = (left + right) / 2;

            if (ar[mid] <= element)
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return mid;
    }

    private static int findStartIndexOfElement(int[] ar, int element) {
        int left = 0;
        int right = ar.length - 1;

        int mid = -1;

        while (left <= right)
        {
            mid = (left + right) / 2;

            if (ar[mid] >= element)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        return mid;
    }
}
