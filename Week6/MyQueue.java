
/**
 * Implementation of a Queue
 * 
 * @Author EvanVu
 */
public class MyQueue<E> implements QueueInterface<E>
{
    private Node<E> top;
    private Node<E> bottom;
    
    public MyQueue(){};
    
    /**
     * Add a new node to the end of the queue
     * @param the value of the node being added
     * @return the value of the node being added
     */
    public E add(E item){
        Node<E> itemNode = new Node<E>(item,null);
        if (this.top==null){ this.top=itemNode; return item;}
        if (this.bottom==null){ 
            this.bottom=itemNode;
            this.top.setNext(this.bottom);
        }
        this.bottom.setNext(itemNode);
        this.bottom=itemNode;
        return item;
    }
    
    /**
     * Get the value of the Node at the top of the queue
     * @return the value of the node at the top of the queue
     */
    public E peek(){
        if (this.top==null) return null;
        return this.top.getValue();
    }
    
    /**
     * Remove the node at the top of the queue
     * @return the item of the removed node
     */
    public E remove(){
        if (this.top==null) return null;
        E temp = this.top.getValue();
        this.top=this.top.getNext();
        return temp;
    }
}
