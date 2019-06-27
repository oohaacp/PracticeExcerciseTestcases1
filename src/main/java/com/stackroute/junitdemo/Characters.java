package com.stackroute.junitdemo;

public class Characters
{
int number;
String s=" ";
char character;
public String checkInputs(char a  )
{
           String result;
            if(a>='A' && a<='Z') //Validating Capital Letters
            {
                return s="Capital";
            }
            else if(a>='a' && a<='z')  // Validating Small Case Letters
            {
                return s = "Small";
            }
            else if(a>='0' && a<='9')  // Digits validation
            {
                return s ="Digit";
            }
            else
            {
                return "Special Symbol";  // Special Symbols
            }
        }
}



