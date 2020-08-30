package com.dsa.sorting;

import com.dsa.Utils;

public class RadixSort {
    public static int getMaxNoOfDigits(int ar[])
    {
        int maxDigits = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++)
        {
            int numOfDigits = getNoOfDigits(ar[i]);
            if (maxDigits < numOfDigits)
            {
                maxDigits = numOfDigits;
            }

        }
        return maxDigits;

    }

    public static int getMax(int ar[])
    {
        int max = Integer.MIN_VALUE;
        for (int i : ar)
        {
            if ( i > max)
                max = i;
        }
        return max;
    }

    public static int getNoOfDigits(int num)
    {
        int digits = 0;
        while (num != 0)
        {
            num /= 10;
            digits++;
        }
        return digits;
    }

    public static void performRadixSort(int ar[])
    {
        int exp = getMax(ar);

        Utils.printArray(ar);
        System.out.println(exp);
        for (int i = 1; exp/i > 0; i*=10)
        {
            processDigitBasedSorting(ar,i);
        }
        Utils.printArray(ar);
    }

    private static void processDigitBasedSorting(int[] ar, int exp) {
        int count[] = new int[10];

        int output[] = new int[ar.length];

        for (int i = 0; i < ar.length; i++)
        {
            count[(ar[i]/exp)%10]++;
        }

        for (int i = 1; i < count.length; i++)
            count[i] += count[i-1];

        Utils.printArray(count);

        for (int i = ar.length - 1; i >= 0; i--)
        {

            output[count[(ar[i]/exp)%10]-1] = ar[i];
            count[(ar[i]/exp)%10]--;
        }

        for (int i = 0; i < ar.length; i++)
            ar[i] = output[i];
        Utils.printArray(ar);
        System.out.println();
    }
}
