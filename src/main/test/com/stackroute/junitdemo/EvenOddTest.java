package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenOddTest {

    EvenOdd object = new EvenOdd();


    @Before
    public void setUp() {

        System.out.println("Before");
    }

    @Test
    public void givenInputStringShouldReturnEven() {//Returns even string//
        String str = object.checkInputs(22);
        assertEquals("test passed", "Jerry", str);
    }

    @Test
    public void givenInputStringShouldReturnOdd() {//Returns odd string//
        String str = object.checkInputs(21);
        assertEquals("test passed", "Tom", str);
    }

    @Test

    public void givenInputStringShouldReturnNotInRange() {//Returns not in range//
        String str = object.checkInputs(1);
        assertEquals("test passed", "Not in range", str);
    }


    @After
    public void tearDown() {
        System.out.println("After");
    }
}