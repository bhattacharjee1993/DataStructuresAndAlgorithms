package com.dsa.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindLongestConsecutiveSequence {
    public static int[] findLongestConsecutiveSequence(Node head) {
        Stack<Node> stack = new Stack<>();
        List<List<Integer>> sequences = new ArrayList<>();

        List<Integer> sequence = new ArrayList<>();
        stack.push(head);

        int currVal = -1;
        while (!stack.empty()) {
            Node temp = stack.pop();
            if ((currVal == -1 || currVal == (temp.value - 1)) ) {
                sequence.add(temp.value);
                currVal = temp.value;
            } else {
                sequences.add(sequence);
                sequence = new ArrayList<>();
                sequence.add(temp.value);
                currVal = temp.value;
            }

            if (temp.left == null && temp.right == null)
            {
                if (!sequence.isEmpty())
                {
                    sequences.add(sequence);
                    sequence = new ArrayList<>();

                }
            }

            if (temp.left != null)
                stack.push(temp.left);
            if (temp.right != null)
                stack.push(temp.right);

        }
        if (!sequence.isEmpty())
        {
            sequences.add(sequence);
        }

        sequences.forEach(value -> {

                System.out.println(value.size() + "\t"   + value.toString());

            System.out.println();
        });
        return new int[]{};
    }


    public static void findLongestConsSeq(Node head, int count, int target, List<Integer> sequence, List<List<Integer>> sequences, int[] max)
    {
        if (head == null)
        {

            return;
        }
        if (head.value == target)
        {
            sequence.add(head.value);
            count++;
        }
        else {
            sequences.add(sequence);
            sequence = new ArrayList<>();
            sequence.add(head.value);
            count = 1;
        }
        if (head.left == null && head.right == null)
        {
            sequences.add(sequence);
            sequence = new ArrayList<>();
        }
        max[0] = Math.max(max[0], count);
        findLongestConsSeq(head.left, count, head.value + 1,sequence, sequences, max);
        findLongestConsSeq(head.right, count, head.value + 1, sequence, sequences, max);
    }



    public static void run() {
        Node node = new Node(100);

        Node l2 = new Node(50);
        Node l3 = new Node(150);

        Node l21 = new Node(25);
        Node l22 = new Node(75);



        node.left = l2;
        node.right = l3;

        l2.left = l21;
        l2.right = l22;

        Node l211 = new Node(12);
        l21.left = l211;

        Node l4 = new Node(175);
        l3.right = l4;

        Node l5 = new Node(125);
        l3.left = l5;


        Node temp = node;
//        inOrderTraversal(temp);

//        System.out.println();

        temp = node;
//        convertBSTToDoublyLinkedList(temp);
//        convertBSTToDoublyLinkedListNotInPlace(temp);
//        traverseLinkedListAsDoublyLinkedListNode();
//        traverseLinkedList();
//        printBST(temp);
        List<Integer> sequence = new ArrayList<>();
        List<List<Integer>> sequences = new ArrayList<>();



//        findLongestConsecutiveSequence(node);
//        int max[] = new int[1];
//        findLongestConsSeq(node, 0, 0, sequence, sequences, max);
//        System.out.println(max[0]);

//        sequences.forEach(value -> {
//            System.out.println(value.toString()+"\t");
//        });


    }
}
