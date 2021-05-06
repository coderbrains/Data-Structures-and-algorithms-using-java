package dsaPrograms;

import java.util.Scanner;

public class Sethe_nth_Bit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The number :");
		int num = sc.nextInt();
		
		System.out.println("Enter the index : ");
		int index = sc.nextInt();
		
		System.out.println(isTrue(num, index));
		
		sc.close();

	}
	
	static int isTrue(int num, int index) {
			
			int a = 1 << index - 1;
			
			return num | a;
		}

}
