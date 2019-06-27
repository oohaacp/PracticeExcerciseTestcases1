package com.stackroute.junitdemo;



public class StringRepeat
{



        public String repeat(String s1, int n)
        {
            String s2=s1.substring(s1.length()-n);
            for(int i=0;i<n;i++)
            {
                s1 += s2;  // String Concatenation
            }
            return s1;
        }
    }



