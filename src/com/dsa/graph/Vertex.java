package com.dsa.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    public String name;
    public boolean visited;
    List<Vertex> adjacencyList;

    public Vertex(String name)
    {
        this.name = name;
        this.visited = false;
        this.adjacencyList = new ArrayList<>();
    }

    public void addAdjacency(Vertex v)
    {
        adjacencyList.add(v);
    }
}
