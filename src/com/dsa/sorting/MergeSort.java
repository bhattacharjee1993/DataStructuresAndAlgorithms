package com.dsa.sorting;

public class MergeSort {

    public static void mergeSort(int ar[]) {
        performMergeSort(ar, 0, ar.length - 1);
        for (int i : ar) {
            System.out.print(i + "\t");
        }
    }

    private static void performMergeSort(int[] ar, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;

            performMergeSort(ar, start, mid);
            performMergeSort(ar, mid + 1, end);

            merge(ar, start, mid, end);
        }


    }

    private static void merge(int[] ar, int start, int mid, int end) {
        int first = start;
        int second = mid + 1;

        int resultant[] = new int[end - start + 1];
        int resultantCtr = 0;
        while (first <= mid && second <= end) {
            if (ar[first] < ar[second]) {
                resultant[resultantCtr++] = ar[first];
                first++;
            } else {
                resultant[resultantCtr++] = ar[second];
                second++;
            }
        }

        if (first <= mid) {
            for (int i = first; i <= mid; i++) {
                resultant[resultantCtr++] = ar[i];
            }
        } else if (second <= end) {
            for (int i = second; i <= end; i++) {
                resultant[resultantCtr++] = ar[i];
            }
        }

        int k = start;
        for (int i = 0; i < resultantCtr; i++) {
            ar[k++] = resultant[i];
        }
    }
}
