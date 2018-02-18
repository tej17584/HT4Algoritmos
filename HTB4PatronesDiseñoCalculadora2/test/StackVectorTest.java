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
public class StackVectorTest {
    
    public StackVectorTest() {
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
     * Test of push method, of class StackVector.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = "1";
        StackVector instance = new StackVector();
        instance.push(item);
        String x = "1";
        assertEquals(instance.peek(), x );
        // TODO review the generated test code and remove the default call to fail.
        if (!(instance.peek() == x)){
            fail("No funciono");
        }
    }

    /**
     * Test of pop method, of class StackVector.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackVector instance = new StackVector();
        Object expResult = "1";
        instance.push(expResult);
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result == expResult)){
            fail("No funciono");
        }
    }

    /**
     * Test of peek method, of class StackVector.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        StackVector instance = new StackVector();
        Object expResult = "1";
        instance.push("3");
        instance.push("1");
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result == expResult)){
            fail("No funciono");
        }
    }

    /**
     * Test of empty method, of class StackVector.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        StackVector instance = new StackVector();
        boolean expResult = true;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result == expResult)){
            fail("No funciono");
        }
    }

    /**
     * Test of size method, of class StackVector.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackVector instance = new StackVector();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result == expResult)){
            fail("No funciono");
        }
    }
    
}
