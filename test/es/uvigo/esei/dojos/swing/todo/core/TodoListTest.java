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
        String s = "stev";
        instance.add(s);
        
        s = "stev";
        instance.add(s);
        
        instance.moveDown(0);
        String result = instance.elementAt(1);
        String expresult = "stev";
        assertEquals(expresult, result);
        System.out.println("Element moved down");

}

@Test
public void testAdd() 
{
    int i = 0;
   System.out.println("add");
        String item = "Mike";
        TodoList instance = new TodoList();
        instance.add(item); 
        i = instance.size();
        assertTrue(i>0);
       System.out.println("Element added"); 
}

@Test
public void testEditAt() 
{
      System.out.println("editAt");
        int i = 0;
        String newValue = "name";
        TodoList instance = new TodoList();
        instance.add(newValue);
        String expresult = "name";
        String result = instance.elementAt(0);
        assertEquals(expresult,result);
        System.out.println("Edited");
}

@Test
public void testRemoveAt() 
{
     System.out.println("removeAt");
        int i1 = 0;
        String m;
 
        TodoList instance = new TodoList();
        m = "Mike";
        instance.add(m);
        i1 = instance.size();
        instance.removeAt(0);
        int i2 = instance.size();
        assertTrue(i2<i1);
        System.out.println("Element has been removed");
}

@Test
public void testSize() 
{
    System.out.println("size");
        TodoList instance = new TodoList();
        
        String s = "stev";
        instance.add(s);
        s = "stev";
        int expresult = 2;
        int result = 2;
        assertEquals(expresult, result);        
        System.out.println("List size is "+result);
}

}
