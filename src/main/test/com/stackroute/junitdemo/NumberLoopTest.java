package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLoopTest
{


        NumberLoop ob = new NumberLoop();


        @Before
        public void setUp() {

            System.out.println("Before");
        }

        @Test
        public void givenInputStringShouldReturnEven() {
            String str = ob.numberLoop(122333);
            assertEquals("test passed", "122333", str);
        }

        @After
        public void tearDown() {
            System.out.println("After");
        }
    }

