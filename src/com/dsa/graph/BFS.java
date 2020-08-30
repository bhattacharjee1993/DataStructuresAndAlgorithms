package com.dsa.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void traverseBFS(Vertex root)
    {
        Queue<Vertex> queue = new LinkedList<>();

        root.visited = true;
        queue.add(root);

        while (!queue.isEmpty())
        {
            Vertex v = queue.poll();
            System.out.print(v.name + "\t");
            for (Vertex adjacency : v.adjacencyList) {
                if (!adjacency.visited)
                {
                    adjacency.visited = true;
                    queue.add(adjacency);
                }
            }
        }
        System.out.println();


    }
}
