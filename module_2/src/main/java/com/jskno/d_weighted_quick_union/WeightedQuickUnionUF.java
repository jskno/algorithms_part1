package com.jskno.d_weighted_quick_union;

public class WeightedQuickUnionUF {

    private final int[] id;
    private final int[] sz;

    // Set id of each object to itself
    // (2N array accesses)
    public WeightedQuickUnionUF(int n) {
        id =  new int[n];
        sz =  new int[n];
        for (int i = 0; i < n; ++i) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    // Check if p and q have same root
    // depth of p and q array accesses)
    // Depth of any node x is at most logN
    // So 2logN array accesses at most
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    // Change root of p to point to root of q
    // (depth of p and q array accesses)
    // 2logN
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) {
            return;
        }
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }

    // Chase parent pointers until reach root
    // (depth of i array accesses)
    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }


}
