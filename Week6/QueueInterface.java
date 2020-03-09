
/**
 * Interface of a Queue to be implemented
 *
 * @author EvanVu
 * @version (a version number or a date)
 */
public interface QueueInterface<E>
{
    public E add(E item);
    
    public E peek();
    
    public E remove();
}
