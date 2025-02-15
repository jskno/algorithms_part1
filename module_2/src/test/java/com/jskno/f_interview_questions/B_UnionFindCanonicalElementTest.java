package com.jskno.f_interview_questions;

import org.junit.jupiter.api.Test;

public class B_UnionFindCanonicalElementTest {

    @Test
    public void test() {
        B_UnionFindCanonicalElement uf = new B_UnionFindCanonicalElement(10);
        uf.union(0, 5);
        uf.union(0, 6);

        uf.union(1, 2);
        uf.union(1, 7);

        uf.union(3, 4);
        uf.union(3, 8);
        uf.union(3, 8);

        System.out.println(uf.find(0));
        System.out.println(uf.find(1));
        System.out.println(uf.find(3));

    }
}
