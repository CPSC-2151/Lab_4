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
 * @invariant: queueMaxSize > 0 AND queueMaxSize <= Integer.MAX_VALUE AND back >= 0 AND back <= queueMazSize -1 AND front >= 0 AND front <= queueMaxSize -1
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
     * @post queueMaxSize = maxSize AND self = new Double[queueMaxSize] AND front = 0 AND back = -1
     *
     */
    public ArrayDoubleQueue(int maxSize)
    {
	this.queueMaxSize = maxSize;
	this.queue = new Double[this.queueMaxSize];
	this.front = 0;
	this.back = -1;

    }

    /**enqueueContact
     * Enqueue adds an item to the queue.
     *
     * @param val the Double to be added
     *
     * @pre |self| < queueMaxSize
     *
     * @post [self = #self with val added to left-most unoccupied index] AND queueMaxSize = #queueMaxSize AND front = #front AND back = #back +1
     *
     */
    @Override
    public void enqueue(Double val)
    {	// queue is full
	if(back == queueMaxSize - 1){
	    System.out.println("Queue is full..");
	    return; 
	}
	queue[++back] = val;
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public Double dequeue()
    {	// queue is empty
	if(front > back){
		System.out.println("Queue is empty..");
		return null;
	}
	Double value = queue[front];
	queue[front++] = null; // clean up the dequeued element
	return value;
    }

    @Override
    public int length()
    {
	return back - front + 1; 

    }

    public String toString()
    {
	String queueOut = "";
	for(Double element : queue){
		if(element != null){
		queueOut += "[" + element + "]";
		}
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
