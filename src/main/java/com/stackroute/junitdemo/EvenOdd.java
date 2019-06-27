package com.stackroute.junitdemo;

public class EvenOdd
{
    int number;
    String s=" ";
    public String checkInputs(int number)
    {
        String result;

        if (number > 20 && number < 30)
        {
            if (number % 2 == 1) {
                return s="Tom";

//System.out.println((n>20&&n<=0)?((n%2)==0?"Jerry":"Tom"):"not in range");
            } else {
                return s="Jerry";
            }
        }
        else
        {
            return "Not in range";
        }

    }
}



