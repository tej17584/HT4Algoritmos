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
public class CircularListTest {
    
    public CircularListTest() {
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
     * Test of removeFirst method, of class CircularList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        CircularList instance = new CircularList();
        Object expResult = "1";
        instance.addFirst("1");
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if(!(result == expResult)){
            fail("No funciono");
        }
    }

   

    /**
     * Test of push method, of class CircularList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = "1";
        CircularList instance = new CircularList();
        instance.push(item);
        String x = "1";
        Object result = instance.pop();
        assertEquals(result, x );
        // TODO review the generated test code and remove the default call to fail.
        if (!(result == x)){
            fail("No funciono");
        }
    }

    /**
     * Test of pop method, of class CircularList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        CircularList instance = new CircularList();
         Object expResult = "1";
        instance.push(expResult);
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result == expResult)){
            fail("No funciono");
        }
    }

     
}
