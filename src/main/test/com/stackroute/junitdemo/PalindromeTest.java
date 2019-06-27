package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {
    Palindrome ob = new Palindrome();


    @Before
    public void setUp() {

        System.out.println("Before");
    }

    @Test
    public void checkPalindrome()
    {
        String a = ob.checkPalindrome(121);
        assertEquals("test passed", "121 is palindrome and sum of even numbers is less tahn 25", a);
        System.out.println("Testcase1");
    }

    @Test
    public void checkPNumberIsNotPalindrome()
    {
        String a = ob.checkPalindrome(1233);
        assertEquals("test passed", "1233 is not palindrome", a);
        System.out.println("Testcase2");
    }

    @Test
    public void checkPNumberIsNotPalindromeAndMoreThanSum()
    {
        String a = ob.checkPalindrome(568484);
        assertEquals("test passed", "568484 is palindrome and sum of even numbers is greater tahn 25", a);
        System.out.println("Testcase3");
    }


    @After
    public void tearDown() {
        System.out.println("After");
    }
}


