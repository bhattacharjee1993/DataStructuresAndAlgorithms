package com.dsa.datastructures;

import com.dsa.sorting.HeapSort;

import java.util.Arrays;

public class LinkedList {

    public static LinkedList instance = new LinkedList();

    private LinkedList() {

    }

    public Node HEAD;

    public boolean createLinkedList(int ar[])
    {
        if (ar.length == 0)
        {
            return false;
        }

        HEAD = new Node(ar[0], null);
        Node temp = new Node(HEAD);

        temp = temp.next;


        for (int i = 1; i < ar.length; i++)
        {
            Node node = new Node(ar[i], null);
            temp.next = node;
            temp = temp.next;
        }
        return true;
    }


    public void reverseLinkedList()
    {
        Node temp = new Node(HEAD);
        temp = temp.next;

        Node current = null;
        Node next = temp.next;
        while (temp != null)
        {
            next = temp.next;
           temp.next = current;
           current = temp;
           temp = next;

        }
        HEAD = current;
        printLinkedList();
    }

    public void printLinkedList()
    {
        Node temp = new Node(HEAD);

        temp = temp.next;

        while (temp != null)
        {
            System.out.print(temp + (temp.next == null ? "":" -->"));
            temp = temp.next;
        }
    }


}
