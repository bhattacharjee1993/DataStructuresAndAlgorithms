package com.dsa.algorithms.temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Warmup {

    public static int binarySearch(int ar[], int num)
    {
        int start = 0;

        int end = ar.length-1;

        while (start <= end)
        {
            int mid = (start + end) / 2;

            if (ar[mid] == num)
            {
                return mid;
            }
            else if (ar[mid] < num)
            {
                start = mid+1;
            }
            else
            {
                end = mid -1;
            }
        }
        return -1;
    }

    public static int[] findStartAndEnd(int ar[], int num)
    {
        int result[] = new int[2];

        int startIdx = -1;
        int endIdx = -1;

        int start = 0;
        int end = ar.length-1;


        while (start <= end)
        {
            int mid = (start + end) / 2;

            if (ar[mid] < num)
            {
                start = mid + 1;
            }
            else if (ar[mid] > num)
            {
                end = mid - 1;
            }
            else
            {
                startIdx = mid;
                end = mid - 1;
            }
        }

        start = 0;
        end = ar.length - 1;
        while (start <= end)
        {
            int mid = (start + end) / 2;

            if (ar[mid] < num)
            {
                start = mid + 1;
            }
            else if (ar[mid] > num)
            {
                end = mid - 1;
            }
            else
            {
                endIdx = mid;
                start = mid + 1;
            }
        }

        result[0] = startIdx;
        result[1] = endIdx;
        return result;
    }

    public static int[] findStartAndEndIdxRecursive(int ar[], int num)
    {
        int result[] = new int[]{-1, -1};

        findStartIdx(ar, 0, ar.length-1, num, result);
        findEndIdx(ar, 0, ar.length-1, num, result);
        return result;
    }

    public static void findStartIdx(int ar[], int left, int right, int num, int result[])
    {
        if (left > right)
            return;
        int mid = (left + right) / 2;

        if (ar[mid] < num)
        {
             findStartIdx(ar, mid+1, right,num, result);
        }
        else if (ar[mid] > num)
        {
             findStartIdx(ar, left, mid-1, num, result);
        }
        else
        {
            result[0] = mid;
             findStartIdx(ar, left, mid - 1, num, result);
        }
    }

    public static void findEndIdx(int ar[], int left, int right, int num, int result[])
    {
        if (left > right)
            return;
        int mid = (left + right) / 2;


        if (ar[mid] < num)
        {
            findEndIdx(ar, mid+1, right, num, result);
        }
        else if (ar[mid] > num)
        {
            findEndIdx(ar, left, mid-1, num, result);
        }
        else
        {
            result[1] = mid;
            findEndIdx(ar, mid+1, right, num, result);
        }
    }

    public static int findElement(int ar[], int start, int end, int num)
    {
        if (start > end)
            return -1;
        int mid = ( start + end ) / 2;

        if (ar[mid] < num)
        {
           return findElement(ar, mid+1, end, num);
        }
        else if (ar[mid] > num)
        {
            return findElement(ar, start, mid-1, num);
        }
        else
        {
            return mid;
        }
    }

    public static List<Integer[]> checkIfThreeNumberSumExists(int ar[], int targetSum)
    {

        List<Integer[]> result = new ArrayList<Integer[]>();
        Arrays.sort(ar);


        for (int i = 0; i < ar.length; i++)
        {
            int start = i + 1;
            int end = ar.length - 1;

            while (start < end)
            {
                int currentSum = ar[start] + ar[end];

                int totalSum = currentSum + ar[i];
                if (totalSum == targetSum)
                {
                    result.add(new Integer[]{ ar[i], ar[start], ar[end]});
                    start++;
                    end--;
                }
                else if (totalSum < targetSum)
                {
                    start++;
                }
                else
                {
                    end--;
                }
            }
        }
        return result;
    }

    public static List<Integer[]> findTwoNumberSum(int ar[], int sum)
    {
        List<Integer[]> result = new ArrayList<Integer[]>();

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < ar.length; i++)
        {
            if (set.contains(sum - ar[i]))
            {
                result.add(new Integer[]{ar[i], sum - ar[i]});
            }
            else
            {
                set.add(ar[i]);
            }
        }
        return result;
    }

    public static int[] findMaxUnSortedIdx(int ar[])
    {
        int leftIdx = 0;
        int rightIdx = ar.length - 1;

        int minOutOfOrder = Integer.MAX_VALUE;
        int maxOutOfOrder = Integer.MIN_VALUE;

        for (int i = 0; i < ar.length; i++)
        {
            if (!isInOrder(ar, i))
            {
                minOutOfOrder = Math.min(ar[i], minOutOfOrder);
                maxOutOfOrder = Math.max(ar[i], maxOutOfOrder);
            }
        }

        while (leftIdx < ar.length && ar[leftIdx] < minOutOfOrder)
        {
            leftIdx++;
        }

        while (rightIdx < ar.length && ar[rightIdx] > maxOutOfOrder)
        {
            rightIdx--;
        }

        if (minOutOfOrder == Integer.MAX_VALUE)
            return new int[]{ -1, -1};
        return new int[] { minOutOfOrder, maxOutOfOrder};

    }

    public static boolean isInOrder(int ar[], int idx)
    {
        if (idx == 0)
            return ar[idx] < ar[idx+1];
        else if (idx == ar.length - 1)
            return ar[idx] > ar[idx - 1];
        else return ar[idx] > ar[idx - 1]  && ar[idx] < ar[idx+1];
    }
}
