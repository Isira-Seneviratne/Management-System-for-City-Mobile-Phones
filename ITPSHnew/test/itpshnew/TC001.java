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
public class TC001 {
    
    public TC001() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getDate method, of class DateTimeFunctions.
     */
    @Test
    public void testGetValidDate() {
        System.out.println("getDate - Valid");
        String expResult = "20 November 2017";
        String result = DateTimeFunctions.getDate();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetInvalidDate() {
        System.out.println("getDate - Invalid");
        String expResult = "-1 November 2017";
        String result = DateTimeFunctions.getDate();
        assertFalse(expResult.equals(result));
    }
    
    @Test
    public void testGetExtremeDate() {
        System.out.println("getDate - Extreme");
        String expResult = "30 November 2017";
        String result = DateTimeFunctions.getDate();
        assertFalse(expResult.equals(result));
    }
    
    /**
     * Test of getMonthVal method, of class DateTimeFunctions.
     */
    
}
