package com.dsa.heap;

import com.dsa.Utils;

public class CreateHeap {

    public static int[] createMaxHeap(int ar[]) {
        Utils.printArray(ar);
        for (int i = ar.length/2; i>=0; i--)
        {
            heapify(ar,i,ar.length);
        }
        Utils.printArray(ar);
        return ar;
    }

    public static void heapify(int ar[], int indexOfRoot, int len) {
        int left = 2 * indexOfRoot + 1;
        int right = 2 * indexOfRoot + 2;

        int maxChildIdx = right < ar.length ? left < ar.length ? ( (ar[right] > ar[left]) ? right : left ) : right : left < ar.length ? left : -1;

        if (maxChildIdx != -1 && ar[maxChildIdx] > ar[indexOfRoot])
        {
            Utils.swap(ar, maxChildIdx, indexOfRoot);
            heapify(ar, maxChildIdx, len);
        }

    }

    public static int[] createMinHeap(int ar[])
    {
        Utils.printArray(ar);
        for (int i = ar.length/2; i>=0; i--)
        {
            minHeapify(ar,i,ar.length);
        }
        Utils.printArray(ar);
        return ar;
    }

    private static void minHeapify(int[] ar, int indexOfRoot, int len) {
        int left;
        int right;
        int minIndex;
        boolean shouldEvaluate;
        do {

            left = 2 * indexOfRoot + 1;

            right = 2 * indexOfRoot + 2;


            minIndex = left < ar.length ? right < ar.length ? ((ar[left] < ar[right]) ? left : right) : left : right < ar.length ? right : -1;

            if (minIndex != -1 && ar[minIndex] < ar[indexOfRoot])
            {
                Utils.swap(ar,minIndex,indexOfRoot);
                indexOfRoot = minIndex;
                shouldEvaluate = true;
            }
            else
            {
                shouldEvaluate = false;
            }
        } while ( shouldEvaluate );



    }
}
