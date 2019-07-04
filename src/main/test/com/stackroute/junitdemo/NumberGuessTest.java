package com.stackroute.junitdemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberGuessTest
    {
        NumberGuess ob=new NumberGuess();
        @Before
        public void setUp()
        {
            System.out.println("Before");
        }
        @Test
        public void givenInputStringShouldReturnLessThanTarget()//returns less than target//
        {
            String str=ob.guessNumber(45,34);
            assertEquals("test case failed","Number guessed is less than original number",str);
            System.out.println("Test Case 1");
        }
        @Test
        public void givenInputStringShouldReturnMoreThanTarget()//return more than target//
        {
            String str=ob.guessNumber(30,34);
            assertEquals("test case failed","Number guessed is more than original number",str);
            System.out.println("Test Case 2");
        }
        @Test
        public void givenInputStringShouldReturnMatchedTarget()//return matched target//
        {
            String str=ob.guessNumber(30,30);
            assertEquals("test case failed","YOU ARE CORRECT",str);
            System.out.println("Test Case 3");
        }
        @Test
        public void givenInputStringShouldReturnNotRange()//return not in range//
        {
            String str=ob.guessNumber(45,70);
            assertEquals("test case failed","Not in range",str);
            System.out.println("Test Case 4");
        }
        @After
        public void tearDown()
        {
            System.out.println("After");
        }

    }


