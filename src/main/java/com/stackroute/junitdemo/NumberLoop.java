package com.stackroute.junitdemo;

public class NumberLoop
{

   int number, i, j;
   String str=" ";
   public String numberLoop(int n) {

       for (i = 0; i < n; i++) {
           for ( j = 0; j <= i; j++) {
               System.out.print(i + 1);
           }
       }
       return "NumberLoop";

   }


    }




