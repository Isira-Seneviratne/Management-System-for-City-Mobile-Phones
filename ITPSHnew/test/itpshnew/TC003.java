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
public class TC003 {
    
    public TC003() {
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
    public void testGetValidDay() {
        System.out.println("getDay - Valid");
        int expResult = 19;
        int result = DateTimeFunctions.getDay();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetInvalidDay() {
        System.out.println("getDay - Invalid");
        int expResult = -1;
        int result = DateTimeFunctions.getDay();
        assertFalse(expResult == result);
    }
    
    @Test
    public void testGetExtremeDay() {
        System.out.println("getDay - Extreme");
        int expResult = 30;
        int result = DateTimeFunctions.getDay();
        assertFalse(expResult == result);
    }
}
