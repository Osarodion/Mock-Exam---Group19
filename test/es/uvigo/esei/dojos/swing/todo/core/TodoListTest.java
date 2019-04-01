/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.dojos.swing.todo.core;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 */
public class TodoListTest {
    
    public TodoListTest() {
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
     * Test of moveUp method, of class TodoList.
     */
    @Test
public void testMoveUp() 
{
    System.out.println("moveUp");
        int i = 0;
        TodoList instance = new TodoList();
        String s = "stev";
        instance.add(s);
       
        instance.moveUp(i);
        String result = instance.elementAt(0);
        String expresult = "stev";
        assertEquals(expresult, result);
        
}

@Test
public void testMoveDown() 
{
    System.out.println("moveDown");
        int i = 0;
        TodoList instance = new TodoList();
        instance.moveDown(i);
}

@Test
public void testAdd() 
{
   System.out.println("add");
        String item = "";
        TodoList instance = new TodoList();
        instance.add(item); 
}

@Test
public void testEditAt() 
{
      System.out.println("editAt");
        int i = 0;
        String newValue = "";
        TodoList instance = new TodoList();
        instance.editAt(i, newValue);
}

@Test
public void testRemoveAt() 
{
     System.out.println("removeAt");
        int i = 0;
        TodoList instance = new TodoList();
        instance.removeAt(i);
}

@Test
public void testSize() 
{
    System.out.println("size");
        TodoList instance = new TodoList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);}
    
}
