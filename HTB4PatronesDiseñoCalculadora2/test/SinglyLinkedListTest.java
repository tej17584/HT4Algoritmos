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
public class SinglyLinkedListTest {
    
    public SinglyLinkedListTest() {
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
     * Test of size method, of class SinglyLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        SinglyLinkedList instance = new SinglyLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if(!(result == expResult)){
            fail("No funciono");
        }
    }

 

    /**
     * Test of removeFirst method, of class SinglyLinkedList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        SinglyLinkedList instance = new SinglyLinkedList();
        instance.addFirst("1");
        Object expResult = "1";
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if(!(result == expResult)){
            fail("No funciono");
        }
    }

    /**
     * Test of getFirst method, of class SinglyLinkedList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        SinglyLinkedList instance = new SinglyLinkedList();
        Object expResult = "1";
        instance.addFirst("1");
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if(!(result == expResult)){
            fail("No funciono");
        }
    }

   

    /**
     * Test of contains method, of class SinglyLinkedList.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object value = null;
        SinglyLinkedList instance = new SinglyLinkedList();
        boolean expResult = false;
        boolean result = instance.contains(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result == expResult)){
            fail("No funciono");
        }
    }

    /**
     * Test of push method, of class SinglyLinkedList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = "1";
        SinglyLinkedList instance = new SinglyLinkedList();
        instance.push(item);
        String x = "1";
        assertEquals(instance.peek(), x );
        // TODO review the generated test code and remove the default call to fail.
        if (!(instance.peek() == x)){
            fail("No funciono");
        }
    }

    /**
     * Test of pop method, of class SinglyLinkedList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        SinglyLinkedList instance = new SinglyLinkedList();
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
     * Test of peek method, of class SinglyLinkedList.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        SinglyLinkedList instance = new SinglyLinkedList();
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
    
}
