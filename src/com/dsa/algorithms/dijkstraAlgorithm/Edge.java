package com.dsa.algorithms.dijkstraAlgorithm;


public class Edge {

    public double weight;
    public Vertex startVertex;
    public Vertex targetVertex;

    public Edge(double weight, Vertex startVertex, Vertex targetVertex)
    {
        this.weight = weight;
        this.startVertex = startVertex;
        this.targetVertex = targetVertex;
    }
}
