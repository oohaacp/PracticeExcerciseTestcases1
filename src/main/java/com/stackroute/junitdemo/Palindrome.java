package com.stackroute.junitdemo;

public class Palindrome
{

    String s="";

    public String checkPalindrome(int a)
    {

        int remainder = 0, sum = 0, n = a, temp = a, x = 0, rem = 0, add = 0;
        while (n > 0)  //Palindrome logic
        {
            remainder = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        if (sum == temp) {
            while (sum > 0)  // Adding all the even numbers from given input
            {
                rem = sum % 10;
                sum = sum / 10;
                if (rem % 2 == 0) {
                    add = add + rem;
                }
            }
            if (add > 25) {
                s = temp+" "+"palindrome and sum of even numbers is greater than 25";
            } else {
                s = temp+"  "+"palindrome and sum of even numbers is less than 25";
            }
        } else {
            s = temp+" "+"is not a palindrome";
        }
        return s;
    }
}







