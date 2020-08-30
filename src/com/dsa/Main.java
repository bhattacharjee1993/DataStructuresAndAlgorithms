package com.dsa;

import com.dsa.algorithms.*;
import com.dsa.algorithms.binaryTree.FindLongestConsecutiveSequence;
import com.dsa.algorithms.binaryTree.binarySearchTree.BSTOperations;
import com.dsa.algorithms.dijkstraAlgorithm.DijkstraAlgorithm;
import com.dsa.algorithms.dynamicProgramming.CoinDenominationFormation;
import com.dsa.algorithms.dynamicProgramming.SubsetEqualToSum;
import com.dsa.algorithms.foobar.*;
import com.dsa.algorithms.strings.FindReverseOfSentenceKeepingEachWordIntact;
import com.dsa.algorithms.strings.LongestCommonSubstringWithNonRepeatingCharacters;
import com.dsa.algorithms.strings.LongestPalindromicSubstring;
import com.dsa.algorithms.strings.ShortestWayToFormString;
import com.dsa.algorithms.temp.*;
import com.dsa.datastructures.LinkedList;
import com.dsa.graph.BFS;
import com.dsa.graph.DFS;
import com.dsa.graph.Vertex;
import com.dsa.sarching.BinarySearchWithIteration;
import com.dsa.sarching.BinarySearchWithRecursion;
import com.dsa.sorting.HeapSort;
import com.dsa.sorting.MergeSort;
import com.dsa.sorting.QuickSort;
import com.dsa.sorting.RadixSort;
import com.sun.jdi.ShortValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import static com.dsa.algorithms.strings.DifferenceOfTwoTimes.difference;

public class Main {

    public static void main(String[] args) throws Exception{
        // write your code here
//        MergeSort.mergeSort(new int[]{10,9,8,7,6,5,4,3,2,1});

//        QuickSort.quickSort(new int[]{70,10,30,20,90,25});





        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        Vertex G = new Vertex("G");
        Vertex H = new Vertex("H");


        A.addAdjacency(B);
        A.addAdjacency(C);
        A.addAdjacency(D);

        B.addAdjacency(E);
        B.addAdjacency(F);

        E.addAdjacency(G);
        F.addAdjacency(H);

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

//        System.out.println(difference("23:45","14:50"));
//        System.out.println(CoinDenominationFormation.findNumberOfWaysToFormDenomination(new int[]{1,2,3},5));
//        System.out.println(CoinDenominationFormation.findMinNumberOfWaysToFormDenomination(new int[]{1,2,3},5));

//        System.out.println(SubsetEqualToSum.subsetSum(new int[]{2,3,8,10},22));

//        System.out.println(BitwiseOperations.reverseBits(3));

//        System.out.println(Arrays.toString(Heap.buildHeap(new int[]{5, 1, 2, 3, 4, 6})));
//        HeapSorting.heapSort(new int[]{5,6,0,-1,-1,9,2,2,2,3,4});
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

        System.out.println(Integer.parseInt("00011"));
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
}
