package com.dsa.algorithms.foobar;

public class StaircaseProblem {

    public static int solution(int n)
    {
        int brickMatric[][] = new int[n+1][n+1];

        brickMatric[0][0] = 1;

        for (int i = 1; i < n+1 ; i++)
        {
            for (int j = 0; j < n+1; j++)
            {
                brickMatric[i][j] = brickMatric[i-1][j];

                if (j >= i)
                    brickMatric[i][j] += brickMatric[i-1][j-i];
            }
        }

        return brickMatric[n][n] - 1;
    }
}
