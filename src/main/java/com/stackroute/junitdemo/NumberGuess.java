package com.stackroute.junitdemo;

public class NumberGuess
{

    int target,num;
    String s="";

    public String guessNumber(int target,int num)
    {

        do{
            if(num>1 && num<50)
            {
                if(num == target)
                {
                    s="YOU ARE CORRECT";
                }
                else if(num<target)
                {
                    s="Number guessed is less than original number";
                }
                else
                {
                    s="Number guessed is more than original number";
                }
            }
            else
            {
                s="Not in range";
            }
        }while (num != target);

        return s;
    }

}
