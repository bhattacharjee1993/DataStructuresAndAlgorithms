package com.dsa.algorithms;

import java.util.Arrays;
import java.util.Stack;

public class FindNoOfIslands {

    static int getNumberOfIslands(int[][] binaryMatrix) {

        boolean visited[][] = new boolean[binaryMatrix.length][binaryMatrix[0].length];


        Stack<int[]> stack = new Stack();

        int[] start = new int[2];

        int noOfIslands = 0;

        boolean flag = false;
        for(int i = 0; i < binaryMatrix.length; i++)
        {
            for(int j = 0; j<binaryMatrix[0].length; j++)
            {
                System.out.println(i +"\t"+j);
                if(binaryMatrix[i][j] == 1 && !visited[i][j])
                {

                    start[0] = i;
                    start[1] = j;
                    flag = true;
                    System.out.println("[i,j] " + ":\t["+i+", "+j+"]");
                    noOfIslands++;
                    stack.push(start);

                    while(!stack.empty())
                    {

                        int[] current = stack.pop();



                        if( current[0] == -1 || current[1] == -1 || visited[current[0]][current[1]] || binaryMatrix[current[0]][current[1]] == 0)
                        {
                            continue;
                        }
                        System.out.println(Arrays.toString(current));
                        visited[current[0]][current[1]] = true;
                        int prevRow = getChild(current[0], -1, binaryMatrix.length);
                        int nextRow = getChild(current[0], 1, binaryMatrix.length);

                        int prevCol = getChild(current[1], -1, binaryMatrix[0].length);
                        int nextCol = getChild(current[1], 1, binaryMatrix[0].length);

//                        if(prevRow == -1 || prevCol == -1 || nextRow == -1 || nextCol == -1)
//                        {
//                            continue;
//                        }

                        stack.push(new int[]{prevRow, current[1]});
                        stack.push(new int[]{nextRow, current[1]});

                        stack.push(new int[]{current[0], prevCol});
                        stack.push(new int[]{current[0], nextCol});

                    }


                }
            }

        }


        return noOfIslands;

    }


    public static int getChild(int current, int incr, int totalLen)
    {
        int val = current + incr;
        if(val >= totalLen || val < 0)
        {
            return -1;

        }
        return val;
    }

    public static void run()
    {
        int ar[][] = new int[][] {
                { 1,0,1,0},
                { 0,1,1,1},
                { 0,0,1,0}
        };
        System.out.println(getNumberOfIslands(ar));

    }
}
