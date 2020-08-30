package com.dsa.sorting;

public class QuickSort {

    public static void quickSort(int ar[])
    {
        print(ar);
        performQuickSort(ar, 0, ar.length-1);
        print(ar);
    }

    private static void performQuickSort(int[] ar, int low, int high) {

        if (low < high)
        {
            int partition = partition(ar,low, high, high);
            print(ar);
            performQuickSort(ar,partition+1,high);
//            print(ar);
            performQuickSort(ar,low,partition-1);
//            pri/nt(ar);
        }
    }

    private static int partition(int[] ar, int low, int high, int pivotIndex) {
        int i = low;
        int j=high - 1;
        while (i<j)
        {
            while ( i< high && ar[pivotIndex] > ar[i] )
            {
                i++;
            }
            while (j>low &&   ar[pivotIndex] < ar[j])
            {
                j--;
            }

            if ( i < j)
            {
                swap(ar,i,j);
                i++;j--;
            }

        }
        swap(ar,i,high);
        return i;
    }

    private static void print(int[] ar) {
        for (int i :
                ar) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    private static void swap(int ar[], int i, int j)
    {
        ar[i] = ar[i] + ar[j] - (ar[j]=ar[i]);
    }
}
