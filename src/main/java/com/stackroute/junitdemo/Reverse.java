package com.stackroute.junitdemo;
import java.util.Scanner;

public class Reverse {
    public String stringreverse(String str) {
        String reverse = "";
        int i;


        for (i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }
}


