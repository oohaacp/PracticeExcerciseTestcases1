package com.stackroute.junitdemo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnspecifiedTest {
    public class UnspecifiedInputTest {

        UnspecifiedInput unspecifiedinput;

        @org.junit.Before
        public void setUp() throws Exception {
            unspecifiedinput = new UnspecifiedInput();
        }

        @org.junit.After
        public void tearDown() throws Exception {
        }

        @Test
        public void addPositiveIntegers() {

            int array[] = {3, 6, 32};
//		Act
            int result = unspecifiedinput.addNumbers(array);
            System.out.println("Test1");

//		Assert
            assertEquals(41, result);
        }

        @Test
        public void addNegativeValuesInArray() {

            int array[] = {3, 6, -32};

//		Act
            int result = unspecifiedinput.addNumbers(array);
            System.out.println("Test2");

//  	Assert
            assertEquals(-23, result);
        }

    }
}