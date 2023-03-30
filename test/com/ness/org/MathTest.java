package com.ness.org;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Expected value -  Assuming
//Actual Value - what u r code return
//TDD
class MathTest {

    @Test
    void testAdd() {
        Math obj = new Math();
        int answer = obj.add(2, 3);
        System.out.println("hello");
        assertEquals(5, answer);
    }

    @Test
    void testSub() {
        System.out.println("hello");
        Math obj  = new Math();
        int ans = obj.sub(5,3);
        assertEquals(2,ans);

    }
}