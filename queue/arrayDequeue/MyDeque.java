package queue.arrayDequeue;

public class MyDeque<E> {

	@SuppressWarnings("hiding")
	class Node<E>{
		
		E data;
		Node<E> prev, next;
		
		public Node(E data) {
			
			this.data = data;
			prev = next = null;
		}
	}
	
	Node<E> rear = null;
	Node<E> front = null; 
	
	void offerFirst(E data) {
		
		Node<E> toAdd = new Node<E>(data);
		
		if(front == null || rear == null) {
			front = rear = toAdd;
		}else {
			toAdd.next = front;
			front.prev = front = toAdd;
		}
	}

	E peekFirst() {
		if(front == null)return null;
		return front.data;
	}

	E pollFirst() {
		
		if(front == null)return null;
		if(front.next == null) {
			E data = front.data;
			front = rear = null;
			return data;
		}else {
			E data = front.data;
			front = front.next;
			front.prev = null;
			return data;
		}
	}

	void offerLast(E data) {
		Node<E> toAdd = new Node<E>(data);
		
		if(rear == null)front = rear = toAdd;
		else {
			toAdd.prev = rear;
			rear.next = toAdd;
			rear = toAdd;
		}
	}

	E peekLast() {
		if(rear==null)return null;
		 return rear.data;
	}

	E pollLast() {
		if(rear==null)return null;
		else if(rear.prev == null) {
			E data = rear.data;
			front = rear = null;
			return data;
		}else {
			E data = rear.data;
			rear = rear.prev;
			rear.next = null;
			return data;
		}
		
	}

}
