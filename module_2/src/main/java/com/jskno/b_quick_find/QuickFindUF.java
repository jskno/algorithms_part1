package com.jskno.b_quick_find;

public class QuickFindUF {

    private final int[] id;

    // Set id of each object to itself
    // (N array accesses)
    public QuickFindUF(int n) {
        id = new int[n];
        for (int i = 0; i < n; ++i) {
            id[i] = i;
        }
    }

    // Check whether p and q are in the same component
    // (2 array accesses)
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    // Change all entries with id[p] to id[q]
    // (at most 2N + 2 array accesses)
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; ++i) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }



}
