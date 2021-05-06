package listInJava.linkedList;

public class MyLinkedList<E> {

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
	
	public void insertFirst(E data) {
		
		Node<E> toAdd = new Node<E>(data);
		
		if(head==null) {
			head = toAdd;
		}else {
			toAdd.next = head;
			head = toAdd;
			
		}
	}
	
	public void printList() {
		
		if(head == null) {
			System.out.println("Empty LinkedList");
			return;
		}
		Node<E> temp = head;
		
		while(temp!= null) {
			
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public E deleteFirst() {
		
		if(head == null) {
			System.out.println("Empty LinkedList, No elements can be deleted");
			return null;
		}
		
		Node<E> temp = head;
		head = head.next;
		return temp.data;
		
		
		
	}


	public void insertLast(E data) {
		
		Node<E> toAdd = new Node<E>(data);
		
		if(head == null) {
			head = toAdd;
			return;
		}
		Node<E> temp = head;
		
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}


	public E deleteLast() {
		
		if(head == null) {
			System.out.println("Empty LinkedList");
			return null;
		}else if(head.next == null) {
			E data = head.data;
			head = null;
			return data;
		}
		
		Node<E> temp = head;
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		
		E data = temp.next.data;
		temp.next = null;
		return data;
	}
}






