package queue.linkedList;

public class MyQueue<E> {
	
	@SuppressWarnings("hiding")
	class Node<E>{
		
		E data;
		Node<E> next;
		
		public Node(E data) {
			
			this.data = data;
			this.next = null;
		}
	}
	
	Node<E> head = null;
	Node<E> rear = null;
	
	public void enQueue(E data) {
		
		Node<E> node = new Node<E>(data);
		
		if(rear==null || head == null) {
		
			head = rear = node;
		}else {
			
			rear.next = node;
			rear = node;
			
		}
	}

	public E deQueue() {
		if(head == null || rear == null) {
			System.out.println("This is an empty queue");
			return null;
		}
		E data = head.data;
		head = head.next;
		return data;
	}

	public E peek() {
		if(head == null || rear == null) {
			System.out.println("This is an empty queue");
			return null;
		}else {
			return head.data;
		}
	}
	
	public void printAll() {
		
		if(head == null || rear == null) {
			System.out.println("this is an empty queue");
		}else {
			Node<E> temp = head;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}
}
