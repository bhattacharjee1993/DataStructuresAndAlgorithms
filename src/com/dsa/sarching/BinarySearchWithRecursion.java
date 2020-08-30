package com.dsa.sarching;

public class BinarySearchWithRecursion {
    public static int  performBinarySearchWithRecursion(int ar[], int element, int start, int end)
    {
        int mid = (start+end) / 2;
        if (ar[mid] == element)
        {
            return mid+1;
        }
        else if (ar[mid] < element)
        {
            return performBinarySearchWithRecursion(ar, element, mid+1, end);
        }
        else
        {
           return performBinarySearchWithRecursion(ar, element, start, mid-1);
        }
    }
}
