package com.jskno.f_interview_questions;

public class B1_UnionFindCanonicalElement {

    private final int[] id;
    private final int[] sz;

    public B1_UnionFindCanonicalElement(int n) {
        id =  new int[n];
        sz =  new int[n];
        for (int i = 0; i < n; ++i) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

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

    public int find(int p) {
        int max = p;
        int root = root(p);
        for (int i = 0; i < id.length; ++i) {
            if (root == id[i] && i > max) {
                max = i;
            }
        }
        return max;
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }


}
