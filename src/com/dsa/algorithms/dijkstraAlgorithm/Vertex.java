package com.dsa.algorithms.dijkstraAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {

    public String name;

    public List<Edge> adjacencyEdgeList;

    public boolean visited;

    public Vertex predecessor;

    public double distance;

    public Vertex(String name)
    {
        this.name = name;
        this.adjacencyEdgeList = new ArrayList<>();
        visited = false;
        distance = Double.MAX_VALUE;

    }

    public void addNeighbour(Edge edge)
    {
        this.adjacencyEdgeList.add(edge);
    }

    public String toString() {
        return name + "\t";
    }

    @Override
    public int compareTo(Vertex other) {
        return Double.compare(distance, other.distance);
    }
}
