package queue.linkedList;

public class MainClass {

	public static void main(String[] args) {
		
		MyQueue<Integer> myQueue = new MyQueue<>();
		
		myQueue.enQueue(12);
		myQueue.enQueue(14);
		myQueue.enQueue(23);
		myQueue.enQueue(45);
		myQueue.enQueue(21);
		myQueue.enQueue(9);
		

//		myQueue.deQueue(); 
		
		myQueue.printAll();
//		
//		
//		System.out.println(myQueue.deQueue());
//		System.out.println(myQueue.deQueue());
//		System.out.println(myQueue.deQueue());
//		System.out.println(myQueue.deQueue());
//		System.out.println(myQueue.deQueue());
//		System.out.println(myQueue.deQueue());
//		System.out.println(myQueue.deQueue());
//		
		

	}

}
