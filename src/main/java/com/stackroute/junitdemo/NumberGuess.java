package com.stackroute.junitdemo;

public class NumberGuess
{

    int target,num;
    String str="";

    public String guessNumber(int target,int num)
    {

        do{
            if(num>1 && num<50)
            {
                if(num == target)
                {
                    str="YOU ARE CORRECT";
                }
                else if(num<target)
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
        }while (num != target);

        return str;
    }

}
