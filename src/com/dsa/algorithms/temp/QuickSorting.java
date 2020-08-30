package com.dsa.algorithms.temp;

import com.dsa.Utils;

public class QuickSorting {
    public static void quickSort(int ar[])
    {
        Utils.printArray(ar);
        performQuickSort(ar,0, ar.length-1);
        Utils.printArray(ar);
    }

    public static void performQuickSort(int ar[], int start, int end)
    {
        if (start == end)
            return;
        int partition = pivot(ar, start, end);

       if (partition+1 < end)
           performQuickSort(ar,partition+1,end);
       if (partition-1 > start)
           performQuickSort(ar,start,partition-1);
    }

    public static int pivot(int ar[], int start, int end)
    {
        int pivotIdx = start;
        int pivotElement = ar[pivotIdx];

        int left = start+1;
        int right = end;
        while (left <= right)
        {
            while (left <= right && ar[left] < pivotElement)
                left++;
            while (right >= left && ar[right] >= pivotElement)
                right--;
            if (left < right)
            {
                Utils.swap(ar,right,left);
                right--;
                left++;
            }
        }

        if (right<=end)
            Utils.swap(ar,right,pivotIdx);

        return right;
    }
}
