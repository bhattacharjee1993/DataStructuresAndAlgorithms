package com.dsa.algorithms.dijkstraAlgorithm;

import java.util.*;

public class DijkstraAlgorithm {


    public static void evaluate()
    {
        Vertex v0 = new Vertex("A");
        Vertex v1 = new Vertex("B");
        Vertex v2 = new Vertex("C");

        v0.addNeighbour(new Edge(1, v0, v1));
        v0.addNeighbour(new Edge(1, v0, v2));
        v1.addNeighbour(new Edge(1, v1, v2));

        calculatePaths(v0);
        List<Vertex> path = getPath(v2);

        for (Vertex v: path)
        {
            System.out.print(v);
        }
        System.out.println();
    }

    public static void calculatePaths(Vertex sourceVertex)
    {
        sourceVertex.distance = 0;
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            return Double.compare(o2.distance, o1.distance);
        });

        Arrays.sort(new Integer[]{2,2,3,1}, new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        });
        priorityQueue.add(sourceVertex);

        while (!priorityQueue.isEmpty())
        {
            Vertex actualVertex = priorityQueue.poll();

            for (Edge e: actualVertex.adjacencyEdgeList)
            {
                Vertex targetVertex = e.targetVertex;
                if ( actualVertex.distance + e.weight < targetVertex.distance )
                {
                    priorityQueue.remove(targetVertex);
                    targetVertex.distance = actualVertex.distance + e.weight;
                    targetVertex.predecessor = actualVertex;
                    priorityQueue.add(targetVertex);
                }
            }
        }
    }

    public static List<Vertex> getPath(Vertex target)
    {
        List<Vertex> pathVertices = new ArrayList<>();

//        pathVertices.add(target);

        for (Vertex vertex = target; vertex != null; vertex = vertex.predecessor)
        {
            pathVertices.add(vertex);
        }

        Collections.reverse(pathVertices);

        return pathVertices;
    }
}
