package com.stackroute.junitdemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterationTest
{
    Iteration iteration;
    String result;
    @Before
    public void setUp()
    {
        iteration=new Iteration();
    }
    @Test
    public void givenInputShouldReturnIterationSeries()
    {
        result=iteration.checkIteration(2);
        assertEquals("condition failed","122",result );
    }
    @Test
    public void givenInputShouldNotReturnIterationSeries()
    {
        result=iteration.checkIteration(0);
        assertEquals("Loop is working","",result );
    }
    @After
    public void tearDown()
    {
        iteration=null;
    }

}