package com.gradescope.DoubleQueue.code;
/*
 * Jaden Humphries
 * Jack Huber
 * Abby Thorton
 * Jared Alvarado
 */
import java.util.ArrayList;

/**ListDoubleQueueContract
 *List implementation for the queue of generic types
 *
 * @invariant: maxListSize > 0
 *
 * @corresponds: max_queue_size = maxListSize
 *
 */
public class ListDoubleQueue <T> implements IDoubleQueue <T> 
{
    private ArrayList<T> LQueue;
    private int maxListSize;

    /**ListDoubleQueueConstructorContact
     * Constructor for the arrayListDouble queue
     *
     * @param maxSize of my array list
     *
     * @pre maxSize > 0
     *
     * @post maxListSize = maxSize AND self = new ArrayList<T>.
     *
     */
    public ListDoubleQueue(int maxSize)
    {
        this.LQueue = new ArrayList<T>();
        this.maxListSize = maxSize;
    }

    /**enqueueContact
     * Enqueue adds an item to the queue
     *
     * @param val the generic type value to be added to the queue
     *
     * @pre |self| < maxListSize
     *
     * @post self = #self with val added to furthest empty position on the left AND maxListSize = #maxListSize
     *
     */
    @Override
    public void enqueue(T val)
    {
        if(LQueue.size() == this.maxListSize)
            LQueue.set(this.maxListSize-1, val);
        else
            LQueue.add(val);
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public T dequeue()
    {
        return LQueue.remove(0);
    }


    @Override
    public int length()
    {
        return LQueue.size();
    }


    public String toString()
    {
        String ret = "";
        for(T d : LQueue)
        {
            ret += ("[" + d + "] ");
        }
        return ret;
    }

}
