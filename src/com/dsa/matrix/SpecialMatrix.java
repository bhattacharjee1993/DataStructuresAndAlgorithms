package com.dsa.matrix;

public class SpecialMatrix {
    /*
    3
    2 4 7
    8 2 1
    3 5 6
     */



    public static void matrixProcess(int size)
    {
        int matrix[][] = {{2,4,7},{8,2,1},{3,5,6}};
        int maxRowVal = -1;
        int maxRowIdx = -1;

        boolean isSpecial = true;
        for(int i = 0; i < matrix.length; i++)
        {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < matrix[i].length; j++)
            {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (maxRowVal < rowSum)
            {
                maxRowVal = rowSum;
                maxRowIdx = i;
            }
            if (maxRowVal < colSum)
            {
                maxRowVal = colSum;
                maxRowIdx = i;
            }
            if (rowSum != colSum)
            {
                isSpecial = false;
                continue;
            }

        }

        if (isSpecial)
        {
            System.out.println((maxRowIdx+1) + "\t" + maxRowVal);
        }
        else
        {
            System.out.println(maxRowVal);
        }
    }
}
