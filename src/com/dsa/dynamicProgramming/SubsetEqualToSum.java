package com.dsa.dynamicProgramming;

public class SubsetEqualToSum {

    public static boolean subsetSum(int data[], int total)
    {
        boolean resultant[][] = new boolean[data.length+1][total+1];

        for(int dataIndex = 0 ; dataIndex < data.length; dataIndex++)
        {
            resultant[dataIndex][0] = true;
        }

        //iterate over to form the resultant using memoization
        for(int resultantData = 1; resultantData < resultant.length; resultantData++)
        {
            for(int totalValue = 1; totalValue <= total; totalValue++)
            {
                //assign value based on the condition
                if(data[resultantData - 1] > totalValue)
                {
                    resultant[resultantData][totalValue] = resultant[resultantData-1][totalValue];
                }
                else
                {
                    resultant[resultantData][totalValue] = resultant[resultantData-1][totalValue] || resultant[resultantData-1][totalValue - data[resultantData-1]];
                }
            }
        }
        return resultant[data.length][total];
    }

}
