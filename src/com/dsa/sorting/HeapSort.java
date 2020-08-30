package com.dsa.sorting;

import com.dsa.Utils;

public class HeapSort {

    public static void performHeapSort(int ar[]) {
        heapify(ar);
        for (int i = ar.length-1; i> 0; i--)
        {
            swap(ar,i,0);
            createMaxHeap(ar,0,i);

        }
        Utils.printArray(ar);
    }

    private static void heapify(int[] ar) {

        for (int i = ar.length / 2; i >= 0; i--) {
            createMaxHeap(ar, i, ar.length);
        }
    }

    private static void createMaxHeap(int[] ar, int i, int len) {
        int left = 2 * i +1 < len ? 2 * i +1: -1;
        int right = 2 * i + 2 < len ? 2 * i + 2 : -1;

        int maxIndex = right == -1 ? (left) : left == -1 ? right : ar[right] > ar[left] ? right : left;

        if (maxIndex != -1 && ar[i] < ar[maxIndex]) {
            swap(ar, i, maxIndex);
            createMaxHeap(ar, maxIndex, len);
        }

    }

    private static void swap(int[] ar, int i, int maxIndex) {
        ar[i] = ar[i] + ar[maxIndex] - (ar[maxIndex] = ar[i]);
    }
}
