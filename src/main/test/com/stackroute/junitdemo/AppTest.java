package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {
    App app;

    @Before
    public  void setUp() {

        System.out.println("Before");
        app = new App();

    }

    @After
    public void tearDown() {
        System.out.println("After");
        //app = null;
    }

    @BeforeClass
    public static void setup() {

        System.out.println("Before");
//        app = new App();

    }

    @AfterClass
    public static void teardown() {
        System.out.println("After");
//        app=null;
    }

    @Test
    public void givenTwoStringShouldReturnConcatinateUpperString() {
//        arrange

        String result = app.concatAndConvertString("hello", "world");
        assertEquals("HELLOWORLD", result);
    }

    @Test
    public void givenTwoStringShouldReturnErrorMessage() {
//        arrange

        String result = app.concatAndConvertString("hello", "null");
        assertEquals("HELLOWORLD", result);


    }

    @Test
    public void givenTwoStringShouldReturnConcatinateError() {
//        arrange

        String result = app.concatAndConvertString("hello", "null");
        assertEquals("HELLOWORLD", result);

    }
}

