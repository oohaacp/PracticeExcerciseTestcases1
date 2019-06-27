package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenOddTest {

    EvenOdd ob = new EvenOdd();


    @Before
    public void setUp() {

        System.out.println("Before");
    }

    @Test
    public void EvenOddCheckAndReturnEven() {
        String s = ob.checkInputs(21);
        assertEquals("test passed", "Jerry", s);
    }

    @Test
    public void EvenOddCheckAndReturnOdd() {
        String s = ob.checkInputs(21);
        assertEquals("test passed", "Tom", s);
    }

    @Test

    public void EvenOddCheckAndNotInRange() {
        String s = ob.checkInputs(1);
        assertEquals("test passed", "Not in Range", s);
    }


    @After
    public void tearDown() {
        System.out.println("After");
    }
}