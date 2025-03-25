package com.jskno.f_interview_questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class C1SuccessorWithDeleteTest {

    @Test
    void test() {
        C1_SuccessorWithDelete c1SuccessorWithDelete = new C1_SuccessorWithDelete(22);

        // 4 5 7 8 12 14 17 19 21
        c1SuccessorWithDelete.remove(0);
        c1SuccessorWithDelete.remove(1);
        c1SuccessorWithDelete.remove(2);
        c1SuccessorWithDelete.remove(3);
        c1SuccessorWithDelete.remove(6);
        c1SuccessorWithDelete.remove(9);
        c1SuccessorWithDelete.remove(10);
        c1SuccessorWithDelete.remove(11);
        c1SuccessorWithDelete.remove(13);
        c1SuccessorWithDelete.remove(15);
        c1SuccessorWithDelete.remove(16);
        c1SuccessorWithDelete.remove(18);
        c1SuccessorWithDelete.remove(20);

        int shouldBe5 = c1SuccessorWithDelete.successor(4);
        int shouldBe7 = c1SuccessorWithDelete.successor(5);
        int shouldBe14 = c1SuccessorWithDelete.successor(12);
        int shouldBe21 = c1SuccessorWithDelete.successor(19);
        int shouldBeNotExist = c1SuccessorWithDelete.successor(21);

        Assertions.assertEquals(5, shouldBe5);
        Assertions.assertEquals(7, shouldBe7);
        Assertions.assertEquals(14, shouldBe14);
        Assertions.assertEquals(21, shouldBe21);
        Assertions.assertEquals(-1, shouldBeNotExist);
        Assertions.assertEquals(-1, c1SuccessorWithDelete.successor(41));
    }

}
