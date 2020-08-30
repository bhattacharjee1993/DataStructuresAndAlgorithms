package com.dsa.algorithms.temp;

import com.dsa.Utils;

public class HeapSorting {

    public static void heapSort(int ar[])
    {
        Utils.printArray(ar);
        buildHeap(ar);

        for (int i = ar.length-1; i >= 1; i--)
        {
            Utils.swap(ar,0,i);
            heapify(ar,0,i-1);
        }
        Utils.printArray(ar);
    }

    public static void buildHeap(int ar[])
    {
        for (int i = ar.length/2; i>= 0; i--)
            heapify(ar,i,ar.length-1);
    }

    public static void heapify(int ar[], int root, int length)
    {
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        int minChildIdx = left <= length ? right <= length ? ar[left] > ar[right] ? left : right : left : right <= length ? right : -1;

        if (minChildIdx != -1 && ar[root] < ar[minChildIdx])
        {
            Utils.swap(ar,minChildIdx,root);
            heapify(ar,minChildIdx,length);
        }
    }
}
