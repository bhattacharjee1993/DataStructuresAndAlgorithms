package com.dsa.dynamicProgramming;

import com.dsa.Utils;

public class CoinDenominationFormation {

    public static int findNumberOfWaysToFormDenomination(int coins[], int value)
    {
        int R[][] = new int[coins.length][value+1];
        for (int i=0; i <= value;i++)
        {
            R[0][i] = i>0 &&  i%coins[0] == 0 ? 1:0;
        }
        for (int i =0; i<coins.length; i++)
        {
            R[i][0] = 1;
        }
        for (int i=1; i<R.length; i++)
        {
            for (int j=0; j<R[i].length;j++)
            {
                if (coins[i] > j)
                {
                    R[i][j] = R[i-1][j];
                }
                else
                {
                    R[i][j] = R[i-1][j] + R[i][j- coins[i]];
                }
            }
        }
        Utils.printArray(R);
        return R[coins.length-1][value];
    }

    public static int findMinNumberOfWaysToFormDenomination(int coins[], int value)
    {
        int R[][] = new int[coins.length][value+1];
        for (int i=0; i <= value;i++)
        {
            R[0][i] = i>0 &&  i%coins[0] == 0 ? i/coins[0]:0;
        }
        for (int i=1; i<R.length; i++)
        {
            for (int j=0; j<R[i].length;j++)
            {
                if (coins[i] > j)
                {
                    R[i][j] = R[i-1][j];
                }
                else
                {
                    R[i][j] = Math.min( R[i-1][j], 1+ R[i][j- coins[i]]);
                }
            }
        }
        Utils.printArray(R);
        return R[coins.length-1][value];
    }
}
