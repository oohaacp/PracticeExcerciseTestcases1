package com.stackroute.junitdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DescendingTest
{




        Descending sorting = new Descending();

        @Test
        public void sortInteger(){

//		Act
            int result = sorting.sort(73914);
            System.out.println("Test1");

//		Assert
            assertEquals("TestPassed",97431, result);
        }


        @Test
        public void sortIntegerWhichContainsZero(){

//		Act
            int result = sorting.sort(43024);
            System.out.println("Test3");

//  	Assert
            assertEquals("TestPassed",44320, result);
        }
    }

