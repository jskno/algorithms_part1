package com.jskno.f_interview_questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B2_UnionFindCanonicalElement {

    private final int[] id;
    private final int[] sz;
    private final Map<Integer, List<Integer>> roots;

    public B2_UnionFindCanonicalElement(int n) {
        id = new int[n];
        sz = new int[n];
        roots = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            id[i] = i;
            sz[i] = 1;
            roots.put(i, new ArrayList<>());
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
            if (i < j) {
                id[i] = j;
                for (int k : roots.get(i)) {
                    id[k] = j;
                    roots.get(j).add(k);
                }
                roots.get(j).add(i);
                roots.get(i).clear();
                sz[j] += sz[i];
                sz[i] = 1;
            } else {
                id[j] = i;
                for (int k : roots.get(j)) {
                    id[k] = i;
                    roots.get(i).add(k);
                }
                roots.get(i).add(j);
                roots.get(j).clear();
                sz[i] += sz[j];
                sz[j] = 1;
            }
        } else {
            if (i < j) {
                id[i] = j;
                for (int k : roots.get(i)) {
                    id[k] = j;
                    roots.get(j).add(k);
                }
                roots.get(j).add(i);
                roots.get(i).clear();
                sz[j] += sz[i];
                sz[i] = 1;
            } else {
                id[j] = i;
                for (int k : roots.get(j)) {
                    id[k] = i;
                    roots.get(i).add(k);
                }
                roots.get(i).add(j);
                roots.get(j).clear();
                sz[i] += sz[j];
                sz[j] = 1;
            }
        }
    }

    public int find(int p) {
        return root(p);
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

}
