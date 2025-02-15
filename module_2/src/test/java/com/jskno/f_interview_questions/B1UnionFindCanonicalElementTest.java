package com.jskno.f_interview_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class B1UnionFindCanonicalElementTest {

    @Test
    public void test() {
        B1_UnionFindCanonicalElement uf = new B1_UnionFindCanonicalElement(10);
        uf.union(0, 5);
        uf.union(0, 6);

        uf.union(1, 2);
        uf.union(1, 7);

        uf.union(3, 4);
        uf.union(4, 8);
        uf.union(4, 8);
        uf.union(8, 9);

        int highestElementOfZero = uf.find(0);
        int highestElementOfOne = uf.find(1);
        int highestElementOfThree = uf.find(3);

        Assertions.assertEquals(6, highestElementOfZero);
        Assertions.assertEquals(7, highestElementOfOne);
        Assertions.assertEquals(9, highestElementOfThree);


    }
}
