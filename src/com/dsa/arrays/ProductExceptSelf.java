package com.dsa.arrays;

public class ProductExceptSelf {

    public static void productExceptSelf(int ar[])
    {
        int output[] = new int[ar.length];
        output[0] = 1;
        int M = 1;
        for(int i=1;i<ar.length;i++)
        {
            M = ar[i-1] * M;
            output[i] = M;
        }

        M=1;
        for (int i=ar.length-2;i>=0;i--)
        {
            M = ar[i+1]*M;
            output[i] *= M;
        }

        for (int a: output)
        {
            System.out.print(a+"\t");
        }
        System.out.println();
    }
}
