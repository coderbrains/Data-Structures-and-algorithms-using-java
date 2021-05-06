package listInJava.linkedList;

public class MainClass {

	public static void main(String[] args) {
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();

		myLinkedList.insertLast(12);
//		myLinkedList.insertLast(23);
//		myLinkedList.insertFirst(34);		
//		myLinkedList.insertFirst(0);
//		myLinkedList.insertLast(290);
		
		myLinkedList.printList();
		
//		System.out.println(myLinkedList.deleteLast());
//		System.out.println(myLinkedList.deleteLast());
//		System.out.println(myLinkedList.deleteLast());
//		System.out.println(myLinkedList.deleteLast());
//		System.out.println(myLinkedList.deleteLast());
//		System.out.println(myLinkedList.deleteFirst());
		myLinkedList.deleteLast();
		myLinkedList.deleteLast();
		System.out.println(myLinkedList.deleteLast());
//		
//	
//		
//		myLinkedList.deleteFirst();
//		myLinkedList.printList();
//		myLinkedList.deleteFirst();
//		myLinkedList.printList();
//		
//		myLinkedList.deleteFirst();
//		myLinkedList.printList();
//		
//		myLinkedList.deleteFirst();
//		myLinkedList.deleteFirst();
//		myLinkedList.deleteFirst();
//		myLinkedList.deleteFirst();
		
	}

}
