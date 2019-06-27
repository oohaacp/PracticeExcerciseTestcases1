package com.stackroute.junitdemo;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

    public class VowelTest {
        Vowel ob;
        @Before
        public void setUp()
        {
            System.out.println("Before");
        }
        @Test
        public void characterTestAndReturnCapital()
        {
            ob = new Vowel();
            String res=ob.checkInputs('A');
            assertEquals("test failed",'A',res);
            System.out.println("TestCase1");

        }
        @Test
        public void characterTestAndReturnSmall()
        {
            ob = new Vowel();
            String res=ob.checkInputs('a');
            assertEquals("test failed",'a',res);
            System.out.println("TestCase2");
        }
        @Test
        public void characterTestAndReturnDigits()
        {
            ob = new Vowel();
            String res=ob.checkInputs('5');
            assertEquals("test passed",'5',res);
            System.out.println("TestCase3");
        }
        @After
        public void tearDown()
        {
            System.out.println("After");
        }

    }


