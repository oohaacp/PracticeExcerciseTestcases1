package com.stackroute.junitdemo;;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class StringRepeatTest
{
    StringRepeat object=new StringRepeat();
        @Before
        public void setUp()
        {
            System.out.println("Before");
        }
        @Test
        public void givenInputStringShouldReturnRepeated()
        {
            String s=object.repeat("oohaa",2);
            assertEquals("test case failed","oohaaaaaa",s);
            System.out.println("Test Case 1");
        }
        @Test
        public void givenInputStringShouldReturnNotRepeated()
        {
            String s=object.repeat("oohaa",0);
            assertEquals("test case failed","oohaa",s);
            System.out.println("Test Case 2");
        }
        @After
        public void tearDown()
        {
            System.out.println("After");
        }
    }

