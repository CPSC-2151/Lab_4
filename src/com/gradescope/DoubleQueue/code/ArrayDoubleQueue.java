package com.gradescope.DoubleQueue.code;
/*
 * Jaden Humphries
 * Jack Huber
 * Abby Thorton
 * Jared Alvarado
 */
/**ArrayDoubleQueueContract
 * Array implementation for the Double queue.
 *
 * @invariant: queueMaxSize > 0 AND queueMaxSize <= Integer.MAX_VALUE AND back >= -1 AND back <= queueMaxSize
 *
 * @corresponds: max_queue_size = queueMaxSize
 *
 */
public class ArrayDoubleQueue implements IDoubleQueue
{
    private Double[] queue;
    private int queueMaxSize;
    private int front;
    private int back;

    /**ArrayDoubleQueueConstructorContact
     * Constructor for the arrayListDouble queue.
     *
     * @param maxSize max size of the array
     *
     * @pre maxSize > 0
     *
     * @post queueMaxSize = maxSize AND self = new Double[queueMaxSize] AND back = -1
     *
     */
    public ArrayDoubleQueue(int maxSize)
    {
	this.queueMaxSize = maxSize;
	this.queue = new Double[this.queueMaxSize];
	this.back = -1;

    }

    /**enqueueContact
     * Enqueue adds an item to the queue.
     *
     * @param val the Double to be added
     *
     * @pre |self| < queueMaxSize
     *
     * @post [self = #self with val added to left-most unoccupied index] AND queueMaxSize = #queueMaxSize AND back = #back +1
     *
     */
    @Override
    public void enqueue(Double val)
    {	
	queue[++back] = val;
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public Double dequeue()
    {	
	Double value = queue[0];
	// re-adjust elements; move them to the left
	int i = 0;
	while(i < back){
		queue[i] = queue[i + 1];
		i++;
	}
	 back--; 
	return value; 
    }

    @Override
    public int length()
    {
	return back + 1; 

    }

    public String toString()
    {
	String queueOut = "";
	for(Double element : queue){
	     queueOut += "[" + element + "] ";
	}
	return queueOut;
    }

    //-----------------Ignore the functions below this line-----------------------
    public int getQueueMaxSize()
    {
        return this.queueMaxSize;
    }

    public Double[] getQueue()
    {
        return this.queue;
    }
}
