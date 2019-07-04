package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharactersTest
{
Characters ob=new Characters();

        @Before
        public void setUp()
    {

        System.out.println("Before");
    }

        @Test
        public void givenInputShouldReturnCapitals()
    {
        String str = ob.checkInputs('A');
        assertEquals("test passed", "Capital Letter", str);
    }

        @Test
        public void givenInputShouldReturnSmallLetter()
        {
        String str = ob.checkInputs('a');
        assertEquals("test passed", "Small Letter", str);
    }

        @Test

        public void givenInputShouldReturnDigit() {
        String str = ob.checkInputs('1');
        assertEquals("test passed", "Digit", str);
    }


        @After
        public void tearDown() {
        System.out.println("After");
    }

    }

