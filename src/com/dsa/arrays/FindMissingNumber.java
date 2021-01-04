package com.dsa.arrays;

public class FindMissingNumber {

    public static int missingNumber(int[] arr) {

        int sum = 0;
        for(int i = 0; i<= arr.length;i++)
        {
            sum +=i;
        }

        for(int i=0;i<arr.length;i++)
        {
            sum -= arr[i];
        }
        return sum;



    }
}
