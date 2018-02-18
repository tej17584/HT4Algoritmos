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
     * Test of operar method, of class Calc.
     */
    @Test
    public void testOperar() {
        System.out.println("operar");
        String expresion = "15*4+2-";
        Calc instance = Calc.getCalc("1");
        double expResult = 7;
        double result = instance.operar(expresion);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
         if (!(expResult == result)){
            fail("Fallo en la operación");
        }
    }
    
}
