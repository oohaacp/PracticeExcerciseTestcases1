package com.stackroute.junitdemo;



public class StringRepeat
{



        public String repeat(String str1, int n)
        {
            String str2=str1.substring(str1.length()-n);
            for(int i=0;i<n;i++)
            {
                str1 += str2;  // String Concatenation
            }
            return str1;
        }
    }



