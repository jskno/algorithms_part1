package com.jskno.f_interview_questions;

import java.util.HashSet;
import java.util.Set;

public class C1_SuccessorWithDelete {

    private final Set<Integer> set;

    public C1_SuccessorWithDelete(int n) {
        set = new HashSet<>(n);
        for (int i = 0; i < n; i++) {
            set.add(i);
        }
    }



}
