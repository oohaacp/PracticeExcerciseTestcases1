package com.stackroute.junitdemo;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest
{
    Palindrome palindrome;
    String result;

    @Before
    public void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    public void givenInputShouldReturnPalindromeNumber() {
        result = palindrome.checkPalindrome(121);
        assertEquals("Palindrome condition failed", "121 is palindrome and sum of even numbers is less than 25", result);
    }

    @Test
    public void givenInputShouldReturnNotPalindromeNumber() {
        result = palindrome.checkPalindrome(12232);
        assertEquals("Not a palindrome constraint failed", "12232 is not a palindrome", result);
    }

    @Test
    public void givenInputShouldReturnPalindromeNumberAndEvenSum() {
        result = palindrome.checkPalindrome(5684865);
        assertEquals("Palindrome inner constraint failed", "5684865 is palindrome and sum of even numbers is greater than 25", result);
    }

    @After
    public void tearDown() {
        palindrome = null;
    }
}