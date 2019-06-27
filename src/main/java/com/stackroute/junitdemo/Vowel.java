package com.stackroute.junitdemo;



public class Vowel {
    int number;
    String s="";
    public String checkInputs(char number)
    {
        if (number > 20 && number < 30)
        {
            if ((number % 2 == 1))
            {
                return s="Tom";
            }
            else
            {
                return s="Jerry";
            }
        }
        else {
            return "Not in range";
        }
    }
}
