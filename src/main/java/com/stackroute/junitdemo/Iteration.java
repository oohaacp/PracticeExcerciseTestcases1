package com.stackroute.junitdemo;

public class Iteration
{

        int i=0,j=0,number;
        String series="";
        public String checkIteration(int number)
        {

            for (i = 1; i <= number; i++)
            {
                for (j = 1; j <= i; j++)
                {
                    series = series + i;
                }
            }
            return series;
        }
    }

