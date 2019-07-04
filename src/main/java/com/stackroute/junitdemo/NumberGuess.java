package com.stackroute.junitdemo;

public class NumberGuess
{

    int target,number;
    String str="";

    public String guessNumber(int target,int num)
    {

        do{
            if(number>1 && number<50)
            {
                if(number== target)
                {
                    str="YOU ARE CORRECT";
                }
                else if(number<target)
                {
                    str="Number guessed is less than original number";
                }
                else
                {
                    str="Number guessed is more than original number";
                }
            }
            else
            {
                str="Not in range";
            }
        }while (number != target);

        return str;
    }

}
