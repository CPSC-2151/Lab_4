package com.gradescope.DoubleQueue.code;
/*
 * Jaden Humphries
 * Jack Huber
 * Abby Thornton
 * Jared Alvarado
 */
/**IDoubleQueueContract
 * Queue that contains the generic type or an empty queue containing ('') characters
 * 
 *@initialization Ensures: Empty queue is created with a size of queueMaxSize
 *
 *@defines: max_queue_size = Z
 *
 *@constraints: 0 < queueMaxSize < T.MAX_VALUE
 *
 */
public interface IDoubleQueue <T>
{

    //This function's contracts are in the individual classes
    public void enqueue(T val);
 
    /**dequeueContract
     * Removes the value from the start if the Queue are returns it.
     *
     *@return The generic type at the start array queue.
     *
     *@pre |self| > 0
     *
     *@post [dequeue() = the generic type value at the start of the queue] AND self = #self, omitting the first element AND queueMAXSize = #queueMaxSize
     * 
     */
    public T dequeue();

    /**lengthContract
     * Returns the size of the arrayQueue as a generic type.
     *
     *@return Int value of the number of elements in arrayQueue.
     *
     *@pre None
     *
     *@post [length() = Int Value of length of arrayQueue] AND self = #self AND queueMaxSize = #queueMaxSize
     *
     */


    public int length();

    /**toStringContract 
     * Returns a String of the generic type values in the arrayQueue
     *
     *@return String of all the generic type values in the queue with the format, "[element1][element2]...[elementn]".
     *
     *@pre none
     *
     *@post [toString() = the specified formatted String displaying all elements in the queue] AND self = #self AND queueMAXSize = #queueMaxSize
     *
     */

    
    public String toString();

    /**
     * Returns the front (left-most position) of my queue without removing that item from the queue
     *
     * @pre none
     *
     * @post [peek() = the generic type value of the first element in my queue] AND self = #self AND queueMaxSize = #queueMaxSize
     *
     * @return The generic type value of the first element in my queue
     */
    default public T peek() {
       int num = length();
        // get first value
        T value = dequeue();
        T firstValue = value;
        enqueue(value);

        // iterate through shifting the rest of the queue back to place
        for (int i = 0; i < num - 1; i++) {
            value = dequeue();
            enqueue(value);
        }

        return firstValue;
    }
}
