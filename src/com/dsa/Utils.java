package com.dsa;

public class Utils {

    public static void printArray(int ar[])
    {
        for (int i : ar) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void printArray(int ar[][])
    {
        for (int i = 0; i < ar.length; i++)
        {
            for (int j = 0; j< ar[i].length; j++)
            {
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }



    public static void swap(int[] ar, int first, int second) {
        ar[first] = ar[first] + ar[second] - (ar[second] = ar[first]);
    }
}
