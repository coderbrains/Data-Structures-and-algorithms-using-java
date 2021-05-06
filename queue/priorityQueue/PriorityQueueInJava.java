package queue.priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueInJava {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> integers = new PriorityQueue<>();
		
		integers.add(23);
		integers.add(34);
		integers.add(9);
		integers.add(5);
		integers.add(20);
		integers.add(32);
		
		
		
		System.out.println(integers);
		
		System.out.println(integers.poll());
		System.out.println(integers.poll());
		System.out.println(integers.poll());
		System.out.println(integers.poll());
		System.out.println(integers.poll());
		System.out.println(integers.poll());
		System.out.println(integers.poll());

	}

}
