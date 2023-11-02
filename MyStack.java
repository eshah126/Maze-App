import java.util.NoSuchElementException;

/**
 * An interface that describes a stack abstract data type
 *
 * @author Benjamin Kuperman (Spring 2005, Spring 2012, Spring 2014)
 */


public class MyStack {
    ArrayList<Square> nextSqaure = new ArrayList<>();
    /**
     * Add an item onto the stack
     * @param item the data item to add (of type T)
     * T newT = new T();
        newT.data = element;
        newNode.next = this.first;
        this.first = newT;
     * 
     * 
     */
        
    
    void push(T item){
        nextSqaure.add(item);
    }

    /**
     * Remove the top item from the stack
     * @return the top item in the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public T pop(){
        /*remove the last one */
        Sqaure removed = nextSqaure.remove()


    }
    T pop() throws NoSuchElementException;

    /**
     * Display the top item from the stack without removing it
     * @return the top item in the stack
     * @throws NoSuchElementException if the stack is empty
     */

    
    Sqaure top() throws NoSuchElementException{
        return nextSqaure.

    }

    /**
     * Find how many items are in the stack
     * @return the number of items in the stack
     */
    public int size(){
        return nextSqaure.size();
    }

    int size();


    /**
     * Determine if the stack is empty
     * @return true if the size is 0, false otherwise
     */
    public boolean isEmpty(){

        return this.first == null;
    }
    boolean isEmpty();

    /**(
     * Clear out the data structure
     */

    void clear);
    

}