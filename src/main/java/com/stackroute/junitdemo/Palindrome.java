package com.stackroute.junitdemo;

public class Palindrome
{
    String output="";

    public String checkPalindrome(int input)
    {

        int remainder = 0, sum = 0, number = input, temp = input, x=0,rem=0,add=0;;
        while (number > 0)
        {
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        if (sum == temp)
        {
            while(sum>0)
            {
                rem=sum%10;
                sum=sum/10;
                if(rem%2==0)
                {
                    add=add+rem;
                }
            }
            if(add>25)
            {
                output=temp+" "+"is palindrome and sum of even numbers is greater than 25";
            }
            else
            {
                output=temp+" "+"is palindrome and sum of even numbers is less than 25";
            }

        }
        else
        {
            output=temp+" "+"is not a palindrome";
        }
        return output;
    }

}








