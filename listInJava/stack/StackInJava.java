package listInJava.stack;

import java.util.Stack;

public class StackInJava {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("Awnaish");
		stack.push("Manish");
		stack.push("Khushee");
		stack.push("Arjun");
		stack.push("Sima");
		stack.push("Late ShivBachan Singh");
		
//		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		System.out.println(stack.search("Late ShivBachan Singh"));
		
		System.out.println(stack);
		

	}

}
