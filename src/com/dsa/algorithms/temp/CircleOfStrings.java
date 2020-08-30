package com.dsa.algorithms.temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CircleOfStrings {

    static final int CHARS = 26;
    int V;
    List<List<Integer>> adj;
    int[] in;

    CircleOfStrings(int V) {
        this.V = V;
        in = new int[V];
        adj = new ArrayList<>(CHARS);

        for (int i = 0; i < CHARS; i++) {
            adj.add(i, new ArrayList<>());
        }
    }
    void addEdge(int v, int w) {
        adj.get(v).add(w);
        in[w]++;
    }

    boolean isEulerianCycle() {
        if (!isSC())
            return false;
        for (int i = 0; i < V; i++)
            if (adj.get(i).size() != in[i])
                return false;
        return true;
    }

    boolean isSC() {

        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
        int n;
        for (n = 0; n < V; n++)
            if (adj.get(n).size() > 0)
                break;
        DFSUtil(n, visited);
        for (int i = 0; i < V; i++)
            if (adj.get(i).size() > 0 && !visited[i])
                return false;

        CircleOfStrings gr = getTranspose();
        for (int i = 0; i < V; i++)
            visited[i] = false;
        gr.DFSUtil(n, visited);
        for (int i = 0; i < V; i++)
            if (adj.get(i).size() > 0 && !visited[i])
                return false;

        return true;
    }
    void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        for (Integer i : adj.get(v))
            if (!visited[i]) {
                DFSUtil(i, visited);
            }
    }

    CircleOfStrings getTranspose() {
        CircleOfStrings g = new CircleOfStrings(V);
        for (int v = 0; v < V; v++) {
            for (Integer i : adj.get(v)) {
                g.adj.get(i).add(v);
                g.in[v]++;
            }
        }
        return g;
    }
    static boolean canBeChained(String[] arr, int n) {
        CircleOfStrings g = new CircleOfStrings(CHARS);
        for (int i = 0; i < n; i++) {
            String s = arr[i];
            g.addEdge(s.charAt(0) - 'a',
                    s.charAt(s.length() - 1) - 'a');
        }
        return g.isEulerianCycle();
    }

    public static void run() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <= T; i++)
        {
            int N = Integer.parseInt(bufferedReader.readLine());

            String[] input = bufferedReader.readLine().split(" ");

            System.out.println(canBeChained(input, N) ? "1" : "0");

        }
    }
}

