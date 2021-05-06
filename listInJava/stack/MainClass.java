package listInJava.stack;

public class MainClass {

	public static void main(String[] args) {
		
		MyStack<Integer> myStack = new MyStack<Integer>();
		
		myStack.push(10);
		myStack.push(13);
		myStack.push(23);
		myStack.push(245);

		System.out.println(myStack.search(100));
		int data =  myStack.pop();
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
		System.out.println(data);

		System.out.println(myStack.pop());
		System.out.println(myStack.pop());

	}

}
