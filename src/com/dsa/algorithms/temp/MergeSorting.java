package com.dsa.algorithms.temp;

import com.dsa.Utils;

public class MergeSorting {

    public static void mergeSort(int ar[])
    {
        Utils.printArray(ar);
        performMergeSort(ar,0, ar.length-1);
        Utils.printArray(ar);
    }

    public static void performMergeSort(int ar[], int start, int end)
    {
        int mid = (end+start)/2;
        if (start == end)
            return;
        if (mid != start)
            performMergeSort(ar,start,mid);
        if (mid != end)
            performMergeSort(ar,mid+1, end);

        int left = start;
        int right = mid+1;
        int temp[] = new int[end - start+1];
        int tempCtr = 0;
        while (left <= mid && right <= end)
        {
            while (left <= mid && ar[left] < ar[right] )
                temp[tempCtr++] = ar[left++];
            while (right <= end && ar[right] <= ar[left])
                temp[tempCtr++] = ar[right++];
        }

        while (left <= mid)
        {
            temp[tempCtr++] = ar[left++];
        }
        while (right <= end)
        {
            temp[tempCtr++] = ar[right++];
        }

        int arrayCtr = start;
        for (int i = 0; i < tempCtr; i++)
        {
            ar[arrayCtr++] = temp[i];
        }

    }
}
