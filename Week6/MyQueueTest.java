

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyQueueTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyQueueTest
{
    /**
     * Default constructor for test class MyQueueTest
     */
    public MyQueueTest()
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
    public void addCase()
    {
        MyQueue<Integer> myQueue1 = new MyQueue<Integer>();
        assertTrue(myQueue1.add(99)==99);
    }
    
    @Test
    public void peekCase()
    {
        MyQueue<Integer> myQueue1 = new MyQueue<Integer>();
        myQueue1.add(1);
        myQueue1.add(2);
        myQueue1.add(3);
        myQueue1.add(4);
        assertTrue(myQueue1.peek()==1);
    }
    
    @Test
    public void removeCase()
    {
        MyQueue<Integer> myQueue1 = new MyQueue<Integer>();
        myQueue1.add(5);
        myQueue1.add(6);
        myQueue1.add(7);
        myQueue1.add(8);
        assertTrue(myQueue1.peek()==5);
        assertTrue(myQueue1.remove()==5);
        assertTrue(myQueue1.peek()==6);
    }
    
    @Test
    public void removeCaseNull()
    {
        MyQueue<Integer> myQueue1 = new MyQueue<Integer>();
        assertTrue(myQueue1.remove()==null);
    }
    
    @Test
    public void peekCaseNull()
    {
        MyQueue<Integer> myQueue1 = new MyQueue<Integer>();
        assertTrue(myQueue1.peek()==null);
    }
}

