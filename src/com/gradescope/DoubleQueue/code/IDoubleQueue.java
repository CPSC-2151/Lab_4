package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 * Queue that contains only Doubles or an empty queue containing ('') characters
 * 
 *@initialization Ensures: Empty queue is created with a size of queueMaxSize
 *
 *@defines: queueMaxSize = Z
 *
 *@constraints: 0 < queueMaxSize < Double.MAX_VALUE
 *
 */
public interface IDoubleQueue
{

    //This function's contracts are in the individual classes
    public void enqueue(Double val);

    /**dequeueContract
     * Removes the value from the start if the Queue are returns it.
     *
     *@return The double at the start array queue.
     *
     *@pre |self| > 0
     *
     *@post dequeue() = [Double value at the start of the queue] AND self = #self, omitting the first element AND queueMAXSize = #queueMAXSize
     * 
     */
    public Double dequeue();

    /**lengthContract
     * Returns the size of the arrayQueue as an int.
     *
     *@return Int value of the number of elements in arrayQueue.
     *
     *@pre None
     *
     *@post length() = [Int Value of length of arrayQueue] AND self = #self AND queueMAXSize = #queueMAXSize
     *
     */


    public int length();

    /**toStringContract 
     * Returns a string of the Double values in the arrayQueue.
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
