package com.stackroute.junitdemo;

public class Characters
{
int number;
String str=" ";
char character;
public String checkInputs(char a  )
{
           String result;
            if(a>='A' && a<='Z') //Validating Capital Letters
            {
                return str="Capital Letter";
            }
            else if(a>='a' && a<='z')  // Validating Small Case Letters
            {
                return str = "Small Letter";
            }
            else if(a>='0' && a<='9')  // Digits validation
            {
                return str="Digit";
            }
            else
            {
                return "Special Symbol";  // Special Symbols
            }
        }
}



