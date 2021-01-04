package com.dsa;

import com.dsa.bitwise.FindMaximumXOR;
import com.dsa.graph.DFS;
import com.dsa.graph.Vertex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {


        System.out.println("================= SAMPLE COMMAND LINE EXECUTION WITH DUMMY TEST CASES ====================");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            System.out.println("Enter any of the following for lookup");
            System.out.println("1./tArrays Problems");
            System.out.println("2./tStrings");
            System.out.println("3./tSorting Problems");
            System.out.println("0 to Quit");

            int choice = Integer.parseInt(bufferedReader.readLine());

            switch (choice)
            {
                case 0:
                    System.out.println("Thank you! Do practice more! Way to go!!!!");
                    System.exit(0);
                    break;
                case 1:

            }
        }

        // write your code here
//        MergeSort.mergeSort(new int[]{10,9,8,7,6,5,4,3,2,1});

//        QuickSort.quickSort(new int[]{70,10,30,20,90,25});


//        SpecialMatrix.matrixProcess(3);




//        DFS.traverseDFS(A);

//        BFS.traverseBFS(A);
//        performTopologicalSort();

//        System.out.println(FirstNonRepeatingCharacter.findFirstNonRepeatingCharacter("aaabcccdeef"));

//        System.out.println(FindFirstDuplicate.findFirstDuplicate(new int[]{8, 4, 6, 2, 6, 4, 7, 9, 5, 8}));

//        System.out.println(FindLongestSubArrayBySum.findLongestSubArrayBySum(new int[]{1, 2, 3, 4, 5, 0, 0, 0, 6, 7, 8, 9, 10}, 15));

//        ProductExceptSelf.productExceptSelf(new int[]{1,2,3,4});

//        HeapSort.performHeapSort(new int[]{10, 5, 6, 40, 30, 20, 15, 12, 90, 1 , 80});

//        System.out.println(BinarySearchWithRecursion.performBinarySearchWithRecursion(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 6, 0, 9));
//        System.out.println(BinarySearchWithIteration.performBinarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 12));

//       FindStartingAndEndingIndexOfElementInSortedArray.findIndicesOfElement(new int[]{1, 2, 3,4,5,5,6}, 5);
//        DijkstraAlgorithm.evaluate();
//        System.out.println(FindMissingNumber.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));

//        System.out.println(FindIndexOfWrongCommit.findWrongCommit(new String[]{"abc123", "abc456", "abc789", "abd123", "abd456"}, new boolean[]{ true, false, false, false, false}));

//        LinkedList.instance.createLinkedList(new int[]{1, 2, 3, 4, 5,6});
//        LinkedList.instance.reverseLinkedList();

//        System.out.println(FindLongestCommonSubsequence.findLongestCommonSubbsequence("GAGATBPQRS","XATGTYBCSRQP"));

//        System.out.println(FindLongestSubstring.findLongestSubstring("ABAPMPABCD","KLMBAPPPABCD"));
//        System.out.println(Arrays.toString(FindRangePairs.findRangePairs(new int[]{-1,0,1,2,6,7,8,9})));

//        FindLongestConsecutiveSequence.run();
//        FindNoOfIslands.run();

//        System.out.println(FindReverseOfSentenceKeepingEachWordIntact.reverseSentence(" Hello  world
//        System.out.println(LongestCommonSubstringWithNonRepeatingCharacters.findLongestCommonSubstringWithNonRepeatingCharacters("abcacac"));
//        System.out.println(ShortestWayToFormString.findShortestWay("abc","abcbcabac"));

//        System.out.println(LongestPalindromicSubstring.findLongestPalindromeString("abcdabad"));

//        System.out.println(CreateHeap.createMinHeap(new int[]{5, 1, 2, 6, 10, 15, 30, 3}));

//        KLargestElements.findKLargestElements(new int[]{5, 1, 2, 6, 10, 15, 30, 3}, 3);
//        int n = 6; // 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
//        int sum = 1;
//        System.out.println(isPrime(5));
//        for (int i = 4; i <= n + 1; i++)
//        {
//            if (isPrime(i))
//                sum+=1;
//        }
//        System.out.println(sum);

//        FindMaximumXOR.findMaximumXOR(new int[]{4,7,18,16,14});
//        System.out.println((x & (x-1)));
//        System.out.println(KLargestElements.findKthLargestElements(new int[]{3,2,3,1,2,4,5,5,6}, 3));
                    // 6 5 5 4 3 3 2 2 1
//        System.out.println(difference("23:45","14:50"));
//        System.out.println(CoinDenominationFormation.findNumberOfWaysToFormDenomination(new int[]{1,2,3},5));
//        System.out.println(CoinDenominationFormation.findMinNumberOfWaysToFormDenomination(new int[]{1,2,3},5));

//        System.out.println(SubsetEqualToSum.subsetSum(new int[]{2,3,8,10},22));

//        System.out.println(BitwiseOperations.reverseBits(3));

//        System.out.println(Arrays.toString(Heap.buildHeap(new int[]{5, 1, 2, 3, 4, 6})));
//        BSTOperations.constructBST(new int[]{100,200,25,50,75,150,12});
//        RadixSort.performRadixSort(new int[]{5, 23, 145, 62, 78, 91});

//        System.out.println(Warmup.binarySearch(new int[]{ 1, 3, 4, 5}, 3));
//        System.out.println(Arrays.toString(Warmup.findStartAndEnd(new int[]{0, 2, 3, 5, 6}, 2)));
//        System.out.println(Arrays.toString(Warmup.findStartAndEndIdxRecursive(new int[]{2, 2, 2, 5, 6}, 2)));
//        System.out.println(Warmup.findElement(new int[]{2, 3, 4, 5}, 0, 3, 5));
//        System.out.println();
//        List<Integer[]> var = Warmup.checkIfThreeNumberSumExists(new int[] {1, 2, 3, 4, 5, 6, 7}, 9);
//        for (Integer[] temp : var)
//        {
//            System.out.println(Arrays.toString(temp));
//        }

//        List<Integer[]> var = Warmup.findTwoNumberSum(new int[] {1, 2, 3, 4, 5, 6, 7}, 9);
//        for (Integer[] temp : var)
//        {
//            System.out.println(Arrays.toString(temp));
//        }

//        System.out.println(Arrays.toString(Warmup.findMaxUnSortedIdx(new int[]{0, 1, 2, 3, 4, 6, 5, 3, 9, 10, 11, 16})));

//        System.out.println(GeneratePrimeString.solution(-10));
        //System.out.println(FindOptimalDistance.solution(1,0));

//        for(String s: Sol.generateParenthesis(3)){
//            System.out.println(s);
//        }
//        System.out.println(StringToInt.myAtoi("91283479932"));
//        System.out.println(Arrays.toString(PegsGearDestruction.answer(new int[]{4, 30, 50})));
//        System.out.println(StaircaseProblem.solution(200));

//        System.out.println(CombinationChallenge.noOfSolutions(12));

//        System.out.println(QueueToDo.solution(17,4));
//        System.out.println(QueueToDo.solution1(0,3));

//        CircleOfStrings.run();

//        System.out.println(Integer.parseInt("00011"));
    }




    public static void performTopologicalSort() {
        List<Vertex> graph = new ArrayList<>();

        graph.add(new Vertex("0"));
        graph.add(new Vertex("1"));
        graph.add(new Vertex("2"));
        graph.add(new Vertex("3"));
        graph.add(new Vertex("4"));
        graph.add(new Vertex("5"));


        graph.get(5).addAdjacency(graph.get(2));
        graph.get(5).addAdjacency(graph.get(0));

        graph.get(4).addAdjacency(graph.get(0));
        graph.get(4).addAdjacency(graph.get(1));

        graph.get(3).addAdjacency(graph.get(1));

        graph.get(2).addAdjacency(graph.get(3));


        DFS.stack = new Stack<>();
        for (int i = 0; i < graph.size(); i++) {
            if (!graph.get(i).visited) {
                DFS.traverseDFSWithStack(graph.get(i));
            }
        }

        for (int i = 0; i < graph.size(); i++) {
            System.out.print(DFS.stack.pop().name + "\t");
        }

    }


    static boolean isPrime(int n)
    {
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n%i == 0)
                return false;
        }
        return true;
    }
}
