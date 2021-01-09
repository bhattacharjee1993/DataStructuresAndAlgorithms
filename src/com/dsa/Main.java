package com.dsa;

import com.dsa.arrays.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {


        System.out.println("================= SAMPLE COMMAND LINE EXECUTION WITH DUMMY TEST CASES ====================");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Enter any of the following for lookup");
            System.out.println("1.\tArrays Problems");
            System.out.println("2.\tStrings");
            System.out.println("3.\tSorting Problems");
            System.out.println("0 to Quit");
            System.out.println();

            int choice = Integer.parseInt(bufferedReader.readLine());

            switch (choice) {
                case 0:
                    exitProgram();
                    break;
                case 1:
                    while (true) {
                        System.out.println("Enter any of the following to look up Array problems");
                        System.out.println("1. Find First Duplicate");
                        System.out.println("2. Find Longest SubArray by Sum");
                        System.out.println("3. Find Missing Number");
                        System.out.println("4. Find Range Pairs");
                        System.out.println("5. Find Product of all numbers except self");
                        System.out.println("\n999 to Quit");
                        System.out.println("0 to Go Back to Previous Options");

                        int arrayChoice = Integer.parseInt(bufferedReader.readLine());
                        int ar[];
                        boolean shouldBreakLoop = false;
                        switch (arrayChoice) {
                            case 999:
                                exitProgram();
                                break;
                            case 0:
                                shouldBreakLoop = true;
                                break;
                            case 1:
                                ar = new int[]{2, 3, 3, 4, 5, 5, 6, 6};
                                System.out.println(FindFirstDuplicate.findFirstDuplicate(ar));
                                break;
                            case 2:
                                ar = new int[]{2, 3, 4, 4, 5, 5, 6, 6};
                                System.out.println(FindLongestSubArrayBySum.findLongestSubArrayBySum(ar, 13));
                                break;
                            case 3:
                                ar = new int[]{1, 3, 4, 5, 6, 8};
                                System.out.println(FindMissingNumber.missingNumber(ar));
                                break;
                            case 4:
                                ar = new int[]{1, 2, 3, 4, 5, 6};
                                System.out.println(Arrays.toString(FindRangePairs.findRangePairs(ar)));
                                break;
                            case 5:
                                ar = new int[]{1, 2, 3, 4, 5, 6};
                                ProductExceptSelf.productExceptSelf(ar);
                                break;
                        }

                        if (shouldBreakLoop)
                            break;
                    }
            }
        }
    }

    static void exitProgram() {
        System.out.println("Thank you! Do practice more! Way to go!!!!");
        System.exit(0);
    }
}
