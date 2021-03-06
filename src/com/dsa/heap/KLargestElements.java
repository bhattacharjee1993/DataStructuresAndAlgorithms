package com.dsa.heap;

import com.dsa.Utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class KLargestElements {

    public static int[] findKLargestElements(int[] ar, int k)
    {
        if (ar == null || k > ar.length)
            return null;
        int heap[] = new int[k];

        for (int i = 0; i < k; i++)
        {
            heap[i] = ar[i];
        }
        createMinHeap(heap);

        for (int i = k; i< ar.length;i++)
        {
            if (ar[i] > heap[0])
            {
                heap[0] = ar[i];
                heapify(heap,0);
            }
        }

      Utils.printArray(heap);
        return heap;

    }


    public static int findKthLargestElements(int[] ar, int k)
    {

        Set<Integer> set = new HashSet<>();
        for (int a: ar)
        {
            set.add(a);
        }
        int idx = 0;
        Iterator s = set.iterator();
        ar = new int[set.size()];
        while (s.hasNext())
        {
            ar[idx++] = (int) s.next();
        }

        if (ar == null || k > ar.length)
            return -1;
        int heap[] = new int[k];

        for (int i = 0; i < k; i++)
        {
            heap[i] = ar[i];
        }
        createMinHeap(heap);

        for (int i = k; i< ar.length;i++)
        {
            if (ar[i] > heap[0])
            {
                heap[0] = ar[i];
                heapify(heap,0);
            }
        }

        return heap[0];

    }


    public static void createMinHeap(int ar[])
    {
        for (int i = ar.length/2; i>=0; i--)
        {
            heapify(ar,i);
        }
    }

    private static void heapify(int[] ar, int indexOfRoot) {
        int left = 2 * indexOfRoot + 1;
        int right = 2 * indexOfRoot + 2;

        int minChildIndex = left < ar.length ? right < ar.length ? ((ar[left] < ar[right] ? left : right)) : left :
                                                right < ar.length ? right : -1;

        if(minChildIndex != -1 && ar[minChildIndex] < ar[indexOfRoot])
        {
            Utils.swap(ar,minChildIndex,indexOfRoot);
            heapify(ar,minChildIndex);
        }
    }
}

