package listInJava.stack;

import java.util.Scanner;

public class ParenthesesBalancing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The String containing only braces :");
		
		String s = sc.nextLine();
		
		char[] charArray = s.toCharArray();

		MyStack<Character> stack = new MyStack<Character>();
		
		for(int i = 0 ; i < charArray.length; i++) {
			
		if(charArray[i] == '(' || charArray[i] == '{' || charArray[i] == '[' ) {
			stack.push(charArray[i]);
		}else if(stack.isEmpty()) {
			stack.push(charArray[i]);
			break;
		}else {
			if(charArray[i] == ')' &&
					stack.peek() == '(') {
				stack.pop();
			}else if(charArray[i] == '}' && stack.peek() == '{') {
				stack.pop();
			}else if(charArray[i] == ']' && stack.peek() == '[') {
				stack.pop();
			}else {
				stack.push(charArray[i]);
			}
			
		}
			
		}
		
		if(stack.isEmpty())System.out.println("balanced");
		else System.out.println("Not balanced");
		sc.close();

	}

}
