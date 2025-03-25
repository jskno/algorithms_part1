package com.jskno.f_interview_questions;

import com.jskno.f_interview_questions.model.ClasspathFileReader;
import java.util.List;

public class A1_SocialNetworkConnectivity {

    private final int networkSize;
    private final int[] id;
    private final int[] sz;

    public A1_SocialNetworkConnectivity(int n) {
        networkSize = n;
        id = new int[n];
        sz = new int[n];
        for (int i = 0; i < n; ++i) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public String earliestDateAllMembersConnected(String file) {
        List<String> readFile = ClasspathFileReader.getFileLines(file);
        for (String line : readFile) {
            String[] strings = line.split(" ");
            int size = connect(Integer.parseInt(strings[1]), Integer.parseInt(strings[2]));
            if (size == networkSize) {
                return strings[0];
            }
        }
        return null;
    }

    private int connect(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) {
            return 0;
        }
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
            return sz[j];
        } else {
            id[j] = i;
            sz[i] += sz[j];
            return sz[i];
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

}
