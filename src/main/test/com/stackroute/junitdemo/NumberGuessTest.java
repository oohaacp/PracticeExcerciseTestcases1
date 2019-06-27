package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

    public class NumberGuessTest
    {
        NumberGuess ob=new NumberGuess();
        @Before
        public void setUp()
        {
            System.out.println("Before");
        }
        @Test
        public void checkTheNumberAndReturnLessThanTarget()
        {
            String s=ob.guessNumber(45,34);
            assertEquals("test case failed","Number guessed is less than original number",s);
            System.out.println("Test Case 1");
        }
        @Test
        public void checkTheNumberAndReturnMoreThanTarget()
        {
            String s=ob.guessNumber(30,34);
            assertEquals("test case failed","Number guessed is more than original number",s);
            System.out.println("Test Case 2");
        }
        @Test
        public void checkTheNumberAndReturnMatchedTarget()
        {
            String s=ob.guessNumber(30,30);
            assertEquals("test case failed","YOU ARE CORRECT",s);
            System.out.println("Test Case 3");
        }
        @Test
        public void checkTheNumberAndReturnNotRange()
        {
            String s=ob.guessNumber(45,70);
            assertEquals("test case failed","Not in range",s);
            System.out.println("Test Case 4");
        }
        @After
        public void tearDown()
        {
            System.out.println("After");
        }

    }


