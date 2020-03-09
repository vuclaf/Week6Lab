import java.util.*;
/**
 * Ehe iterator for the MyLinkedStack class
 *
 * @author EvanVu
 */
class MyStackIterator<E> implements Iterator<E>
{
    private Node<E> current;
    private Node<E> previous;
    private Node<E> previous2;
    MyStack<E> myStack;
    
    /**
     * Constructor for the iterator
     * @param the stack that the iterator iterates
     */
    public MyStackIterator(MyStack<E> myStack){
        this.current=myStack.getTop();
        this.myStack=myStack;
    }
    
    /**
     * Check if there is still an element in the stack
     * @return true if there is still element in the stack, false if not
     */
    public boolean hasNext(){
        if(current==myStack.getBottom()){
            return false;
        }
        return true;
    }
    
    /**
     * Return the current node and move on to the next node
     * @return the current node
     */
    public E next(){
        if (current==null) return null;
        if (current==myStack.getBottom()) return current.getValue();
        if (current.getNext()==myStack.getBottom()) previous2=previous;
        previous=current;
        current=current.getNext();
        return previous.getValue();
    }
    
    /**
     * Remove the current node
     */
    public void remove(){
        if(current.equals(myStack.getTop())){
            myStack.setTop(current.getNext());
            current=myStack.getTop();
        }
        if(current.equals(myStack.getBottom())){
            myStack.setBottom(previous);
            current=myStack.getBottom();
            previous=previous2;
        }
        else{
            previous.setNext(current.getNext());
            current=null;
            current=previous;
        }
    }
}