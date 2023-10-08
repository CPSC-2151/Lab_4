package com.gradescope.DoubleQueue.code;

import java.util.ArrayList;

/**ListDoubleQueueContract
 *List implementation for the double queue
 *
 * @invariant: maxListSize > 0
 *
 * @corresponds: max_queue_size = maxListSize
 *
 */
public class ListDoubleQueue implements IDoubleQueue
{
    private ArrayList<Double> LQueue;
    private int maxListSize;

    /**ListDoubleQueueConstructorContact
     * Constructor for the arrayListDouble queue
     *
     * @param maxSize of my array list
     *
     * @pre maxSize > 0
     *
     * @post maxListSize = maxSize AND self = new ArrayList<Double>.
     *
     */
    public ListDoubleQueue(int maxSize)
    {
        this.LQueue = new ArrayList<Double>();
        this.maxListSize = maxSize;
    }

    /**enqueueContact
     * Enqueue adds an item to the queue
     *
     * @param val the double to be added to the queue
     *
     * @pre |self| < maxListSize
     *
     * @post self = #self with val added to furthest empty position on the left AND maxListSize = #maxListSize
     *
     */
    @Override
    public void enqueue(Double val)
    {
        if(LQueue.size() == this.maxListSize)
            LQueue.set(this.maxListSize-1, val);
        else
            LQueue.add(val);
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public Double dequeue()
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
        for(Double d : LQueue)
        {
            ret += ("[" + d + "] ");
        }
        return ret;
    }

}
