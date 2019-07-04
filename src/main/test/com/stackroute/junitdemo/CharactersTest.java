package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharactersTest
{
Characters object=new Characters();

        @Before
        public void setUp()
    {

        System.out.println("Before");
    }

        @Test
        public void givenInputShouldReturnCapitals()
    {
        String str = object.checkInputs('A');
        assertEquals("test passed", "Capital Letter", str);
    }

        @Test
        public void givenInputShouldReturnSmallLetter()
        {
        String str = object.checkInputs('a');
        assertEquals("test passed", "Small Letter", str);
    }

        @Test

        public void givenInputShouldReturnDigit() {
        String str = object.checkInputs('1');
        assertEquals("test passed", "Digit", str);
    }


        @After
        public void tearDown() {
        System.out.println("After");
    }

    }

