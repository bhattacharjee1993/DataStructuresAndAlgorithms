package com.dsa.algorithms.foobar;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.*;

public class FindOptimalDistance {

    static int minValue = Integer.MAX_VALUE;

    public static int solution(int source, int destination) {

        System.out.println(getNeighbours(20).toString());

        boolean visited[][] = new boolean[64][64];
//        dfs(source,destination,visited, 1);
        bfs(source,destination,visited, 1);


        return minValue;
    }


    public static void dfs(int src, int dest, boolean[][] visited, int noOfTerms)
    {
        for (Integer i: getNeighbours(src))
        {
            System.out.println(src + "\t" +i +"\t" + noOfTerms);
            if (i == dest)
            {
                minValue = Math.min(minValue, noOfTerms);
                System.out.println(minValue+"====");
            }
            else
            {
                if (!visited[src][i])
                {

                    visited[src][i] = true;
//                    if (minValue > noOfTerms)
                        dfs(i,dest,visited,noOfTerms+1);
                }

            }
        }
    }

    static class TempModel
    {
        TempModel(int value, int level)
        {
            this.value = value;
            this.level = level;
        }
        Integer value;
        Integer level;
    }

    public static void bfs(int src, int dest, boolean[][] visited, int noOfTerms)
    {
        Queue<TempModel> queue = new LinkedList<TempModel>();
        Queue<Integer> level = new LinkedList<Integer>();

        queue.add(new TempModel(src,1));
        level.add(noOfTerms);

        int ctrSrc = src;
        while (!queue.isEmpty())
        {
            TempModel tempSrc = queue.poll();

//            int tempLevel = level.poll();

            for (Integer i: getNeighbours(tempSrc.value))
            {
                System.out.println(tempSrc.value +"\t" + i +"\t"+tempSrc.level);
                if (i == dest)
                {
                    System.out.println("==========="+minValue);
                    minValue = Math.min(tempSrc.level, minValue);
                }
                else if (!visited[tempSrc.value][i])
                {
                    visited[tempSrc.value][i] = true;
                    queue.add(new TempModel(i,tempSrc.level+1));
                }
            }

//            if (ctrSrc != tempSrc)
//                noOfTerms++;
//            ctrSrc = tempSrc;

        }
    }

    public static List<Integer> getNeighbours(int src) {
        List<Integer> possibleCombinations = new ArrayList<Integer>();

        if ((src - 2) > 0 &&  src % 8 - (src - 2) % 8 > 0 && (src - 2 - 8) >= 0) {
            possibleCombinations.add(src - 2 - 8);
        }
        if ((src - 2) > 0 && src % 8 - (src - 2) % 8 > 0 && (src - 2 + 8) < 64) {
            possibleCombinations.add(src - 2 + 8);
        }
        if ((src + 2) % 8 - src % 8 > 0 && (src + 2 - 8) > 0) {
            possibleCombinations.add(src + 2 - 8);
        }
        if ((src + 2) % 8 - src % 8 > 0 && (src + 2 + 8) < 64) {
            possibleCombinations.add(src + 2 + 8);
        }
        if ((src - 1) >= 0 && (src % 8) - (src - 1) % 8 > 0 && (src - 1 - 16) >= 0) {
            possibleCombinations.add(src - 1 - 16);
        }
        if ((src - 1) >= 0 && (src % 8) - (src - 1) % 8 > 0 && (src - 1 + 16) < 64 ) {
            possibleCombinations.add(src - 1 + 16);
        }
        if ((src + 1) % 8 - src % 8 > 0 && (src + 1 - 16) >= 0) {
            possibleCombinations.add(src + 1 - 16);
        }
        if ((src + 1) % 8 - src % 8 > 0 && (src + 1 + 16) < 64) {
            possibleCombinations.add(src + 1 + 16);
        }

        return possibleCombinations;

    }
}
