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
        public void CharacterCheckAndReturnCapitalLetter()
    {
        String s = ob.checkInputs('A');
        assertEquals("test passed", "Capital", s);
    }

        @Test
        public void CharacterCheckAndReturnSmallLetter() {
        String s = ob.checkInputs('a');
        assertEquals("test passed", "Small", s);
    }

        @Test

        public void characterCheckAndReturnDigit() {
        String s = ob.checkInputs('1');
        assertEquals("test passed", "Digit", s);
    }


        @After
        public void tearDown() {
        System.out.println("After");
    }

    }

