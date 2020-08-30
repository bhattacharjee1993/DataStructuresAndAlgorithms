package com.dsa.datastructures;

public class Node
{
    public Node next;
    public int value;

    public Node(int value, Node next)
    {
        this.value = value;
        this.next = next;
    }

    public Node(Node head)
    {
        this.next = head;
    }

    public String toString()
    {
        return value+"";
    }
}
