import java.util.NoSuchElementException;

/**
 * An parameterized interface for the Queue Abstract Data Type
 *
 * @author Benjamin Kuperman (Spring 2005, Spring 2012, Spring 2014)
 */

public interface QueueADT<T> {
    /**
     * Add an item to the queue
     * @param item the data item to add (of type T)
     */
    void enqueue(T item);

    /**
     * Remove the front item from the queue
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public T dequeue()
    {
        if (head == null)
            return null;
        T element = head.data;
        head = head.next;
        if (head == null)    
        {
            tail = null;
        }
        return element;
    }
    T dequeue() throws NoSuchElementException;

    /**
     * Return the front item in the queue without removing it
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */

    public T front(){
        
    } 
    T front() throws NoSuchElementException;

    /**
     * Find how many items are in the queue
     * @return the number of items in the queue
     */
    int size();

    /**
     * Determine if the queue is empty
     * @return true if the size is 0, false otherwise
     */
    public boolean isEmpty()
    {
        return head == null;
    }
    boolean isEmpty();
    

    /**
     * Clear out the data structure
     */
    void clear();

}
