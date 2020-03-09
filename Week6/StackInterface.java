import java.util.*;
/**
 * Stack interface to be implemented by MyStack
 *
 * @author EvanVu
 */
public interface StackInterface<E>
{
    /**
     * Check if the stack is empty
     *
     * @return   true if the stack is empty
     */
    boolean empty();
    
    E peek();
    
    E pop();
    
    E push(E item);
    
    int search(E wanted);
}
