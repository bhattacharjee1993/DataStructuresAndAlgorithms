package com.dsa.binarySearchTree;

import com.dsa.binaryTree.DoublyLinkedListNode;
import com.dsa.binaryTree.Node;

import java.util.ArrayList;
import java.util.List;

public class BSTOperations {

    public static Node headNodeBST = null;

    public static void constructBST(int ar[])
    {
        for (int i = 0; i < ar.length;i++)
        {
            insertNode(ar[i]);
            printBST(headNodeBST);
            System.out.println();
        }

        int elementToSearch = 11;
        System.out.println(elementToSearch + " contains in BST: "+ contains(headNodeBST,elementToSearch));

        int elementToDelete = 100;
        delete(elementToDelete);
        printBST(headNodeBST);
    }


    private static boolean contains(Node headNodeBST, int value) {
        Node temp = headNodeBST;
        while (temp != null)
        {
            if (temp.value == value)
                return true;
            else if (value < temp.value)
                temp = temp.left;
            else
                temp = temp.right;
        }
        return false;
    }

    public static void delete(int value)
    {
        Node temp = headNodeBST;
        Node nodeToDelete = temp;
        Node parent = null;
        while (temp != null)
        {

            if (temp.value == value)
            {
               nodeToDelete =  temp;
               break;
            }
            else if (value < temp.value) {
                parent = temp;
                temp = temp.left;
            }
            else {
                parent = temp;
                temp = temp.right;
            }

        }

        if (nodeToDelete == null)
        {
            System.out.println("Node is not present with: "+ value);
            return;
        }


        deleteNode(nodeToDelete, parent);

    }

    private static void deleteNode(Node nodeToDelete, Node  parent) {
        if (nodeToDelete.left != null && nodeToDelete.right != null) {
            Node swappedNode = getMinValueNode(nodeToDelete.right);
            nodeToDelete.value = swappedNode.value;
            deleteNode(swappedNode, nodeToDelete);
        } else if (parent == null) {
            if (nodeToDelete.left != null) {
                nodeToDelete.value = nodeToDelete.left.value;
                nodeToDelete.left = nodeToDelete.left.left;
                nodeToDelete.right = nodeToDelete.left.right;
            }
            else if (nodeToDelete.right != null) {
                nodeToDelete.value = nodeToDelete.right.value;
                nodeToDelete.left = nodeToDelete.right.left;
                nodeToDelete.right = nodeToDelete.right.right;
            }
        }
        else if (parent.left == nodeToDelete)
        {
            parent.left = nodeToDelete.left != null ? nodeToDelete.left : nodeToDelete.right;
        }
        else if (parent.right == nodeToDelete.right)
        {
            parent.right = nodeToDelete.right != null ? nodeToDelete.right : nodeToDelete.left;
        }

    }

    public static Node getMinValueNode(Node head) {
        Node temp = head;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    private static void printBST(Node head) {

        if (head == null)
            return;
        printBST(head.left);
        System.out.print(head.value + "\t");
        printBST(head.right);


    }

    public static void insertNode(int num)
    {
        if (headNodeBST == null)
        {
            headNodeBST = new Node(num);
            return;
        }
        Node temp = headNodeBST;
        Node parent = null;

        while (temp != null)
        {
            parent = temp;
            if (num < temp.value)
            {
                if (temp.left == null)
                {
                    temp.left = new Node(num);
                    return;
                }
                temp = temp.left;
            }
            else
            {
                if (temp.right == null)
                {
                    temp.right = new Node(num);
                    return;
                }
                temp = temp.right;
            }
        }

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
        convertBSTToDoublyLinkedListNotInPlace(temp);
        traverseLinkedListAsDoublyLinkedListNode();
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


    static Node head;
    static DoublyLinkedListNode headNode;


    static Node prev = null;
    static DoublyLinkedListNode prevNode = null;

    public static void convertBSTToDoublyLinkedList(Node root)
    {
        if (root == null)
            return;
        convertBSTToDoublyLinkedList(root.left );

        if (head == null)
        {
            head = root;
        }
        else {
            root.left = prev;
            prev.right = root;
        }

        prev = root;
        System.out.println(root);
        convertBSTToDoublyLinkedList(root.right);

    }

    public static void convertBSTToDoublyLinkedListNotInPlace(Node root)
    {
        if (root == null)
            return;
        convertBSTToDoublyLinkedListNotInPlace(root.left );

        DoublyLinkedListNode current = null;

        if (headNode == null)
        {
            headNode = new DoublyLinkedListNode(null,null,root.value);
            current = headNode;

        }
        else {
            DoublyLinkedListNode currentNode = new DoublyLinkedListNode(prevNode,null,root.value);
            current = currentNode;

            prevNode.next = current;
        }

        prevNode = current;
//        System.out.println(headNode.value);
//        traverseLinkedListAsDoublyLinkedListNode();
        convertBSTToDoublyLinkedListNotInPlace(root.right);

    }


    public static void traverseLinkedList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.value +"\t");
            temp = temp.right;
        }
        System.out.println();
    }

    public static void traverseLinkedListAsDoublyLinkedListNode()
    {
        DoublyLinkedListNode temp = headNode;
        while (temp != null)
        {
            System.out.print(temp.value +"\t");
            temp = temp.next;
        }
        System.out.println();
    }



    public static void inOrderTraversal(Node root)
    {
        if (root == null)
            return;
        inOrderTraversal(root.left);
        System.out.println(root.value);
        inOrderTraversal(root.right);
    }

}
