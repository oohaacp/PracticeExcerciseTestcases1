package com.stackroute.junitdemo;

public class EvenOdd
{
    int number;
    String str=" ";
    public String checkInputs(int number)
    {
        String result;

        if (number > 20 && number < 30)
        {
            if (number % 2 == 1) {
                return str="Tom";

//System.out.println((n>20&&n<=0)?((n%2)==0?"Jerry":"Tom"):"not in range");
            } else {
                return str="Jerry";
            }
        }
        else
        {
            return "Not in range";
        }

    }
}



