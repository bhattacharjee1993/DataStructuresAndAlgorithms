package com.dsa.heap;

import com.dsa.Utils;
import javafx.util.Pair;

import java.util.Arrays;

public class Heap {
    public static int[] buildHeap(int ar[])
    {
        for (int i = ar.length/2; i >= 0; i--)
        {
            siftDown(ar,i,ar.length);
//            siftDownIterative(ar,i,ar.length);
//            siftDownMaxHeap(ar, i, ar.length);
//            System.out.println(Arrays.toString(ar));
        }
        printArrayToLen(ar,ar.length);
        ar = insert(ar, 0);
        Utils.printArray(ar);

        ar = insert(ar, -1);
        Utils.printArray(ar);

        int len = ar.length;

        len = delete(ar,2,len);
        printArrayToLen(ar,len);

        len = delete(ar,1,len);
        printArrayToLen(ar,len);

        System.out.println(search(ar,0,4,len));
        return ar;
    }

    public static void printArrayToLen(int ar[], int len)
    {
        for (int i = 0; i < len; i++)
        {
            System.out.print(ar[i] + "\t");
        }
        System.out.println();
    }


    public static int[] insert(int array[],int element)
    {
        int clone[] = new int[array.length+1];
        for (int i = 0; i < array.length; i++)
        {
            clone[i] = array[i];
        }
//        Utils.printArray(clone);
//        System.out.println("\n");
        clone[array.length] = element;
        siftUp(clone, array.length);
        return clone;
    }

    public static int delete(int ar[], int idx, int length)
    {
        Utils.swap(ar, idx, length-1);
        siftDown(ar,idx,length-1);
        return length - 1;
    }

    public static int search(int ar[], int root, int value, int length)
    {
        int left = 2 * root + 1;
        int right = 2 * root + 2;
        int idx = -1;
        if (left < length )
        {
            if (ar[left] == value)
                idx = left;
            else if (value > ar[left])
                idx = search(ar,left,value,length);
        }
        if (right < length )
        {
            if (ar[right] == value)
                idx = right;
            else if (value > ar[right])
                idx = Math.max(idx,search(ar,right,value,length));
        }
        return idx;

    }

    public static void siftUp(int[] ar, int i)
    {
        int parent = (i -1)/2;

        if ( ar[parent] > ar[i])
        {
//            Utils.printArray(ar);
            Utils.swap(ar,parent,i);
            siftUp(ar,parent);
        }
    }

    private static void siftDown(int[] ar, int i, int length) {
        int left = 2 * i +1;
        int right = 2 * i + 2;

        int min = left < length ? right < length ? ar[left] < ar[right] ? left : right : left : right < length ? right : -1;

        if (min != -1 && ar[i] > ar[min])
        {
            Utils.swap(ar,min,i);
            siftDown(ar,min,length);
        }
    }

    private static void siftDownMaxHeap(int[] ar, int i, int length) {
        int left = 2 * i +1;
        int right = 2 * i + 2;

        int min = left < length ? right < length ? ar[left] > ar[right] ? left : right : left : right < length ? right : -1;

        if (min != -1 && ar[i] < ar[min])
        {
            Utils.swap(ar,min,i);
            siftDownMaxHeap(ar,min,length);
        }
    }

    public static void siftDownIterative(int ar[], int i, int length)
    {
        int left = 2 * i + 1;

        while (left < length)
        {
            int right = 2 * i + 2;

            int minIdx = right < length ?  ar[left] < ar[right] ? left : right : -1 ;

            if (minIdx != -1 && ar[i] > ar[minIdx])
            {
                Utils.swap(ar,minIdx,i);
                i = minIdx;
                left = 2 * i + 1;
            }
            else
            {
                break;
            }
        }




    }
}
