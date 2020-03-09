

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyStackTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyStackTest
{
    /**
     * Default constructor for test class MyStackTest
     */
    public MyStackTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void emptyCase()
    {
        MyStack<Integer> myStack1 = new MyStack<Integer>();
        assertEquals(true, myStack1.empty());
        assertTrue(myStack1.push(1)==1);
        assertEquals(false, myStack1.empty());
    }
    
    @Test
    public void peekCase()
    {
        MyStack<Integer> myStack1 = new MyStack<Integer>();
        Integer res1 = myStack1.push(3);
        assertTrue(myStack1.peek()==3);
    }
    
    @Test
    public void peekCaseNull()
    {
        MyStack<Integer> myStack1 = new MyStack<Integer>();
        assertTrue(myStack1.peek()==null);
    }
    
    @Test
    public void popCaseNull()
    {
        MyStack<Integer> myStack1 = new MyStack<Integer>();
        assertTrue(myStack1.pop()==null);
    }
    
    @Test
    public void popCase()
    {
        MyStack<Integer> myStack1 = new MyStack<Integer>();
        assertTrue(myStack1.push(4)==4);
        assertTrue(myStack1.push(5)==5);
        assertTrue(myStack1.pop()==5);
    }
    
    @Test
    public void searchCase()
    {
        MyStack<Integer> myStack1 = new MyStack<Integer>();
        assertTrue(myStack1.push(4)==4);
        assertTrue(myStack1.push(5)==5);
        assertTrue(myStack1.search(5)==0);
    }
    
    @Test
    public void searchCaseNull()
    {
        MyStack<Integer> myStack1 = new MyStack<Integer>();
        assertTrue(myStack1.push(4)==4);
        assertTrue(myStack1.push(5)==5);
        assertTrue(myStack1.search(6)==-1);
    }
}

