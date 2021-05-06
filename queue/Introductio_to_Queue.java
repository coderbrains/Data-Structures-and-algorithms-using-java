package queue;

public class Introductio_to_Queue {
	
	/*
	 * 
	 * Queue is an interface
	 * We cannot instantiate the queue data structure
	 * It is implemented through the following different data structures.
	 * 	1.LinkedList
	 * 	2.ArrayDequeue
	 * 	3.PriorityQueue
	 * 
	 * FIFO
	 * 
	 * Methods Throwing Exceptions are:-
	 * 
	 * 1. add()
	 * 2. remove()
	 * 3. element() --> used to peek the queue.
	 * 
	 * 
	 * Methods Not Throwing the Exceptions
	 * 
	 * offer()
	 * poll()
	 * peek()
	 * 
	 * 
	 * Push Operation in queue is called the ENQUEUE
	 * Pop operation from the queue is called the DEQUEUE
	 * 
	 * DEQUE - > (DECK) --> doubly ended queue.
	 * 
	 * Push Operation is always at the rear end but the pop operation is always at the 
	 * front end...
	 * 
	 * 
	 * 1. LinkedList
	 * 
	 * That is how we can instantiate the queue using linked list
	 * Most Easy implementation
	 * --> Queue<Integer> queue = new LinkiedList<Integer>();
	 * 
	 * We should implement our queue using linked list.
	 * 
	 * 
	 * 2. ArrayDeque
	 * --> It is a doubly ended queue which is 
	 * 		implemented by using the array
	 * 
	 * Doubly Ended queue are implemented using the array dequeu
	 * and the Linkedlist 
	 * There are following functions
	 * 2.1 Functions throwing the exception
	 * 
	 * addFirst()
	 * addLast
	 * removeFirst()
	 * removeLast()
	 * getFirst()
	 * getLast()
	 * 
	 * 
	 * 2.2 Function that do not throws any exceptions are :
	 * 
	 * offerFirst()
	 * offerLast()
	 * pollFirst()
	 * pollLast()
	 * peekLast()
	 * peekFirst()
	 * 
	 * 
	 * 3. PriorityQueue
	 * 
	 * ---> These are used when the priority of the element is defined
	 * ---> Uses Heap data structures 
	 * ---> The order of insertion is not preserved
	 * ---> However the removing of the elements
	 *      is according to the natural sorting of 
	 *      the object which has been passed.
	 *      
	 *       Method------------------------------------------
	 *       
	 * PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	 * 
	 * 
	 */

}
