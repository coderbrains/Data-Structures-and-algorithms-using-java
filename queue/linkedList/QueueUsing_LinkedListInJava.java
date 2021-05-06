package queue.linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsing_LinkedListInJava {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(12);
		queue.add(145);
		queue.poll();
		System.out.println(queue);
		
		

	}

}
