package com.dsa.algorithms.binaryTree;

public class DoublyLinkedListNode {

    public  DoublyLinkedListNode prev;
    public DoublyLinkedListNode next;

    public DoublyLinkedListNode(DoublyLinkedListNode prev, DoublyLinkedListNode next, int value)
    {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }
    public int value;
}
