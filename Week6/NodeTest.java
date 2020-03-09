

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NodeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NodeTest
{
    /**
     * Default constructor for test class NodeTest
     */
    public NodeTest()
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
    public void firstCase()
    {
        Node<Integer> node1 = new Node<Integer>(3, null);
        Node<Integer> node2 = new Node<Integer>(4, null);
        node1.setNext(node2);
        node2.setValue(2);
        assertTrue(node2.getValue()==2);
        assertEquals(node2, node1.getNext());
    }

    @Test
    public void secondCase()
    {
        Node<String> node1 = new Node<String>("bro", null);
        Node<String> node2 = new Node<String>("ski", null);
        assertNull(node1.getNext());
        node1.setNext(node2);
        assertEquals(node2, node1.getNext());
    }
}


