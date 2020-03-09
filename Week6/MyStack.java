import java.util.*;
/**
 * Write a description of class MyStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyStack<E> implements StackInterface<E>, Iterable<E>
{
    //The Node at the top and the Node at the bottom of the stack
    private Node<E> top;
    private Node<E> bottom;
    
    /**
     * Constructor for MyStack object
     */
    public MyStack(){
    }
    
    /**
     * Create an iterator for the stack
     * @return A stack iterator
     */
    public Iterator<E> iterator(){
        return new MyStackIterator<E>(this);
    }
    
    /**
     * Set the top Node to a desired Node
     * @param The new top Node
     */
    void setTop(Node<E> newTop){
        this.top=newTop;
    }
    
    /**
     * Set the bottom Node to a desired Node
     * @param the new bottom Node
     */
    void setBottom(Node<E> newBot){
        this.bottom=newBot;
    }
    
    /**
     * Get the Node at the top
     * @return the Node at the top
     */
    Node<E> getTop(){
        return this.top;
    }
    
    /**
     * Get the Node at the Bottom
     * @return the Node at the bottom
     */
    Node<E> getBottom(){
        return this.bottom;
    }
    
    /**
     * Check if the Stack is empty
     * @return true if the stack is empty
     */
    public boolean empty(){
        if (top==null && bottom==null){
            return true;
        }
        return false;
    }
    
    /**
     * Get the Value of the top Node in the Stack
     * @return value of the top Node
     */
    public E peek(){
        if (this.top==null) return null;
        return top.getValue();
    }
    
    /**
     * Remove the current Node at the top of the Stack
     * @return the value of the top Node of the Stack
     */
    public E pop(){
        if (this.top==null) return null;
        Node<E> oldTop = this.top;
        this.top=this.top.getNext();
        return oldTop.getValue();
    }
    
    /**
     * Add a new Node to the top of the stack
     * @param the value of the new top Node
     * @return the value of the new top Node
     */
    public E push(E item){
        if (this.top==null){ this.top=new Node<E>(item,null); 
            return item;
        }
        Node<E> newTop = new Node<E>(item,this.top);
        if (this.bottom==null){
            this.bottom=this.top;
            newTop.setNext(this.bottom);
        }
        this.top=newTop;
        return item;
    }
    
    /**
     * Perform a search for a wanted value in the stack
     * @return the distance of the Node containing the wanted value from the top
     */
    public int search(E wanted){
        Iterator<E> itr = new MyStackIterator<E>(this);
        int i=0;
        while (itr.hasNext()){
            if (itr.next().equals(wanted)) return i;
            i++;
        }
        return -1;
    }
}
