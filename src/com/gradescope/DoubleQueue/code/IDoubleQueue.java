package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 *
 *
 *@initialization Ensures: 
 *
 *@defines: 
 *
 *@constraints: max_queue_size > queueMaxSize 
 *
 */
public interface IDoubleQueue
{

    //This function's contracts are in the individual classes
    public void enqueue(Double val);

    /**dequeueContract
     *
     *
     *@return The double at the start array queue.
     *
     *@pre ArrayQueue.empty()!== True.
     *
     *@post Double element at start of queue is returned and removed from queue AND queueMaxSize--. 
     * 
     *
     */
    public Double dequeue();

    /**lengthContract
     *
     *
     *@return Int value of length of arrayQueue .
     *
     *@pre 
     *
     *@post Int Value of length of arrayQueue is returned.
     *
     */


    public int length();

    /**toStringContract 
     *
     *
     *@return String of doubles in array.
     *
     *@pre ArrayQueue.empty()!== True.
     *
     *@post Doubles of array are converted to a string and returned as a list.
     *
     */

    
    public String toString();
}
