/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author isira
 */
public class DateTimeFunctionsTest {
    
    public DateTimeFunctionsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getDay method, of class DateTimeFunctions.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        int expResult = 18;
        int result = DateTimeFunctions.getDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMonth method, of class DateTimeFunctions.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        String expResult = "November";
        String result = DateTimeFunctions.getMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class DateTimeFunctions.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        int expResult = 2017;
        int result = DateTimeFunctions.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class DateTimeFunctions.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate - Valid");
        String expResult = "18 November 2017";
        String result = DateTimeFunctions.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetInvalidDate() {
        System.out.println("getDate - Invalid");
        String expResult = "-1 November 2017";
        String result = DateTimeFunctions.getDate();
        assertFalse(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGeExtremeDate() {
        System.out.println("getDate - Extreme");
        String expResult = "30 November 2017";
        String result = DateTimeFunctions.getDate();
        assertFalse(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getMonthVal method, of class DateTimeFunctions.
     */
    @Test
    public void testGetMonthVal() {
        System.out.println("getMonthVal");
        int expResult = 11;
        int result = DateTimeFunctions.getMonthVal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
