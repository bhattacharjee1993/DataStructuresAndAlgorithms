package com.dsa.graph;

import java.util.Stack;

public class DFS {

    public static Stack<Vertex> stack;

    public static void traverseDFS(Vertex root) {

        Stack<Vertex> stack = new Stack<>();
        root.visited = true;
        stack.add(root);

        while (!stack.empty()) {
            Vertex v = stack.pop();
            System.out.print(v.name + "\t");
            for (Vertex adjacency : v.adjacencyList) {
                if (!adjacency.visited)
                {
                    adjacency.visited = true;
                    stack.push(adjacency);
                }
            }
        }
        System.out.println();

    }


    public static void traverseDFSWithStack(Vertex vertex)
    {
        vertex.visited = true;
        for (Vertex vertex1 : vertex.adjacencyList) {
            if (!vertex1.visited)
            {
                traverseDFSWithStack(vertex1);
            }

        }
        stack.push(vertex);
    }


}
