package listInJava.stack;

public class MyStack<E> {
	
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
	
	public void push(E data) {
		
		Node<E> toAdd = new Node<E>(data);
		
		if(head==null) {
			head = toAdd;
		}else {
			toAdd.next = head;
			head = toAdd;
			
		}
	}
	
	public E pop() {
		
		if(head == null) {
			System.out.println("Empty Stack, No elements can be popped");
			return null;
		}
		
		Node<E> temp = head;
		head = head.next;
		return temp.data;
		
	}

	public int search(E data) {
		
		
		if(head == null) {
			return -1;
		}else {
			Node<E> temp = head;
			boolean found = false;
			while(temp!=null) {
				if(temp.data == data) {
					found = true;
					break;
				}
				temp = temp.next;
			}
			if(found)return 1;
			return -1;
		}
		
	}

	public E peek() {
		if(head == null) {
			return null;
		}else {
			return head.data;
		}
	}

	public  boolean isEmpty() {
		if(head == null) {
			return true;
		}else {
			return false;
		}
	}

}
