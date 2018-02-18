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
public class ListTest {
    
    public ListTest() {
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
     * Test of size method, of class List.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        List instance = new ListImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class List.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        List instance = new ListImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class List.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = null;
        List instance = new ListImpl();
        instance.addFirst(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class List.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = null;
        List instance = new ListImpl();
        instance.addLast(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class List.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        List instance = new ListImpl();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class List.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        List instance = new ListImpl();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class List.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object value = null;
        List instance = new ListImpl();
        boolean expResult = false;
        boolean result = instance.contains(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ListImpl implements List {

        public int size() {
            return 0;
        }

        public boolean isEmpty() {
            return false;
        }

        public void addFirst(E value) {
        }

        public void addLast(E value) {
        }

        public E getFirst() {
            return null;
        }

        public E removeFirst() {
            return null;
        }

        public boolean contains(E value) {
            return false;
        }
    }
    
}
