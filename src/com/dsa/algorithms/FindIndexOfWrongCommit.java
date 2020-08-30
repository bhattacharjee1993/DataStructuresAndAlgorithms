/**
 * You are given with
 * an array of commit ids: [abc123, abc456, abc789, abd123, abd456]
 * And a library function that returns whether that commit id passes or not: [ true, true, false, false, false]
 * You are to find out the index where the failure happened in O(logN)
 * */


package com.dsa.algorithms;

public class FindIndexOfWrongCommit {

    public static String findWrongCommit(String commitIds[], boolean commitValid[])
    {
        int low = 0;
        int high = commitValid.length - 1;
        int index = -1;
        boolean hasOneFail = false;
        while (low <= high)
        {
            int mid = (low + high) / 2;

            if (commitValid[mid])
            {

                low = mid +1;
            }
            else
            {
                index = mid;
                hasOneFail = true;
                high = mid - 1;
            }
        }

        return index >= 0 && hasOneFail ? commitIds[index] : "NA";
    }
}
