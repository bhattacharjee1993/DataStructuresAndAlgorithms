package com.dsa.bitwise;

public class FindMaximumXOR {

    public static void findMaximumXOR(int [] input)
    {
        long xorVal = removeMaxIdxAngGetXOR(input,false);
        long maxRange = (long) Math.pow(2, 32) -1;

        long current = 0;


        for (int i = 0; i < input.length; i++)
        {
            long maxXor = Integer.MIN_VALUE;
            long kthVal = -1;
            current = maxRange;
            long range = current-100;
            while (current > range)
            {
                long tempMaxXor = xorVal ^ current;

                if (tempMaxXor > maxXor) {
                    maxXor = tempMaxXor;
                    kthVal = current;
                }
                current--;
            }
            System.out.println(kthVal);
            xorVal = removeMaxIdxAngGetXOR(input,true);
            current = 0;
        }



    }


    public static long removeMaxIdxAngGetXOR(int[] input, boolean shouldRemove)
    {
        long maxVal = Long.MIN_VALUE;
        int maxIdx = -1;
        long xorVal = 0;



            for (int i = 0; i < input.length; i++)
            {
                if (input[i] == Integer.MIN_VALUE)
                    continue;
                if (shouldRemove && input[i] > maxVal)
                {
                    maxVal = input[i];
                    maxIdx = i;
                }
                xorVal = xorVal ^ input[i];
            }

            if ( maxIdx != -1)
            {
                xorVal = xorVal ^ input[maxIdx];
                input[maxIdx] = Integer.MIN_VALUE;
            }

        return xorVal;
    }
}
