package com.jskno.f_interview_questions;

public class C1_SuccessorWithDelete {

    private int logicalSize;
    private final int[] set;

    public C1_SuccessorWithDelete(int n) {
        logicalSize = n;
        set = new int[n];
        for (int i = 0; i < n; i++) {
            set[i] = i;
        }
    }

    public void remove(int x) {
        int pos = indexOf(x);
        if (pos == -1) {
            return;
        }
        logicalSize -= 1;
        for (int j = pos; j < logicalSize; j++) {
            set[j] = set[j + 1];
        }
    }

    public int successor(int x) {
        return successor(0, logicalSize - 1, x);
    }

    public int successor(int start, int end, int x) {
        int pos = indexOf(x);
        if (pos == -1 || pos == logicalSize - 1) {
            return -1;
        }
        return set[pos + 1];
    }

    public int indexOf(int x) {
        return indexOf(0, logicalSize - 1, x);
    }

    public int indexOf(int start, int end, int x) {
        int midTerm = (end + start) / 2;
        int element = set[midTerm];
        if (start == end) {
            if (element == x) {
                return end;
            } else {
                return -1;
            }
        } else {
            if (element < x) {
                return indexOf(midTerm + 1, end, x);
            } else if (element > x) {
                return indexOf(start, midTerm - 1, x);
            } else {
                return midTerm;
            }
        }
    }

}
