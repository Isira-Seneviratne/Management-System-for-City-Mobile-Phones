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
public class TC002 {
    
    public TC002() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Test of getMonth method, of class DateTimeFunctions.
     */
    @Test
    public void testGetValidMonth() {
        System.out.println("getMonth - Valid");
        String expResult = "November";
        String result = DateTimeFunctions.getMonth();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetInvalidMonth() {
        System.out.println("getMonth - Invalid");
        String expResult = "abcd";
        String result = DateTimeFunctions.getMonth();
        assertFalse(expResult.equals(result));
    }
    
    @Test
    public void testGetExtremeMonth() {
        System.out.println("getMonth - Extreme");
        String expResult = "January";
        String result = DateTimeFunctions.getMonth();
        assertFalse(expResult.equals(result));
    }
}
