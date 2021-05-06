package queue.arrayDequeue;

import java.util.ArrayDeque;

public class ArrayDequeueInJava {

	public static void main(String[] args) {

		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		
		dq.addFirst(12);
		dq.addLast(23);
		System.out.println(dq.getFirst() + " " + dq.getLast());
		System.out.println(dq.removeFirst() + " "  + dq.removeLast());
		
		// without Exception
		
		dq.offerFirst(12);
		dq.offerLast(23);
		System.out.println(dq.peekFirst() + " " + dq.peekLast());
		System.out.println(dq.pollFirst() + " "  + dq.pollLast());
		

	}

}
