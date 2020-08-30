package com.dsa.algorithms.binaryTree;

public class Node {
    public int value;
    public Node left;
    public Node right;

    public String toString()
    {
        return value+"";
    }

    public Node()
    {

    }

    public Node(int value)
    {
        this.value = value;
    }

    public Node(int value, Node left, Node right)
    {
        this.value = value;
        this.left = left;
        this.right = right;
    }


}
