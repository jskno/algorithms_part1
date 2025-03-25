package com.jskno.f_interview_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class B3UnionFindCanonicalElementTest {

    @Test
    public void test() {
        B3_HintWeightedQuickUnionUF uf = new B3_HintWeightedQuickUnionUF(16);
        uf.union(6, 0);
        uf.union(0, 5);

        uf.union(1, 2);
        uf.union(1, 7);

        uf.union(11, 12);
        uf.union(10, 11);
        uf.union(11, 0);

        uf.union(14, 13);
        uf.union(15, 13);

        uf.union(3, 4);
        uf.union(8, 4);
        uf.union(4, 8);
        uf.union(8, 9);

        uf.union(3, 15);

        int highestElementOfZero = uf.find(0);
        int highestElementOfOne = uf.find(1);
        int highestElementOfThree = uf.find(3);
        int highestElementOfFour = uf.find(4);
        int highestElementOfSeven = uf.find(7);

        Assertions.assertEquals(12, highestElementOfZero);
        Assertions.assertEquals(7, highestElementOfOne);
        Assertions.assertEquals(15, highestElementOfThree);
        Assertions.assertEquals(15, highestElementOfFour);
        Assertions.assertEquals(7, highestElementOfSeven);

    }
}
