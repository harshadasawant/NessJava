package com.ness.org;

import org.junit.jupiter.api.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

//Expected value -  Assuming
//Actual Value - what u r code return
//TDD
class MathTest {

    @BeforeAll
   static void beforeAll(){
        System.out.println("Before All");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before Each");
    }


    @AfterAll
   static void afterAll(){
        System.out.println("After All");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After Each");
    }
    @Test
    void testAdd() {
        Math obj = new Math();
        int answer = obj.add(2, 3);
        System.out.println("hello");
        assertEquals(5, answer);
    }

    @Test
    @Disabled
    void testSub() {
        System.out.println("hello");
        Math obj  = new Math();
        int ans = obj.sub(5,3);
        assertEquals(2,ans);
    }

    @Test
    @DisplayName("testingAssertNull")
    void testAssert(){
        String s =null;
       assertNull(s);
    }
    @Test
    void testAssertThrows(){
        String s =null;
        assertThrows(NullPointerException.class, ()->{
            s.hashCode();
        });
    }
}