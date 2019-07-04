package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest
{


        Reverse ob = new Reverse();


        @Before
        public void setUp() {

            System.out.println("Before");
        }

        @Test
        public void givenInputStringShouldReturnReverse() {
            String s = ob.stringreverse("oohaa");
            assertEquals("test passed", "aahoo", s);
        }


        @After
        public void tearDown() {
            System.out.println("After");
        }


}