/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Tejada
 */
public class CalcTest {
    
    public CalcTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCalc method, of class Calc.
     */
    @Test
    public void testGetCalc() {
        System.out.println("getCalc");
        String forma = "";
        Calc expResult = null;
        Calc result = Calc.getCalc(forma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiStack method, of class Calc.
     */
    @Test
    public void testGetMiStack() {
        System.out.println("getMiStack");
        Calc instance = null;
        Stack<String> expResult = null;
        Stack<String> result = instance.getMiStack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMiStack method, of class Calc.
     */
    @Test
    public void testSetMiStack() {
        System.out.println("setMiStack");
        Stack<String> miStack = null;
        Calc instance = null;
        instance.setMiStack(miStack);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of operar method, of class Calc.
     */
    @Test
    public void testOperar() {
        System.out.println("operar");
        String expresion = "";
        Calc instance = null;
        double expResult = 0.0;
        double result = instance.operar(expresion);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
