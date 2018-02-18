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
public class DoublyLinkedListTest {
    
    public DoublyLinkedListTest() {
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
     * Test of removeLast method, of class DoublyLinkedList.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        DoublyLinkedList instance = new DoublyLinkedList();
        Object expResult = "1";
        instance.addLast("1");
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!(result == expResult)){
            fail("No funciono");
        }
    }

   

    /**
     * Test of getFirst method, of class DoublyLinkedList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        DoublyLinkedList instance = new DoublyLinkedList();
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
     * Test of push method, of class DoublyLinkedList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = "1";
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.push(item);
        String x = "1";
        assertEquals(instance.peek(), x );
        // TODO review the generated test code and remove the default call to fail.
        if (!(instance.peek() == x)){
            fail("No funciono");
        }
    }

    /**
     * Test of pop method, of class DoublyLinkedList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        DoublyLinkedList instance = new DoublyLinkedList();
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
     * Test of peek method, of class DoublyLinkedList.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        DoublyLinkedList instance = new DoublyLinkedList();
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
