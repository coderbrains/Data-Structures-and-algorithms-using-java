package dsaPrograms;

import java.util.Scanner;

public class Find_nth_Bit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number you want to store : ");
		int num = sc.nextInt();
		
		System.out.println("Enter the index you want to know :");
		int index = sc.nextInt();
		
		
		if(isTrue(num, index)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		
		
		

		sc.close();
	}
	
	
	static boolean isTrue(int num, int index) {
		
		int a = 1 << index - 1;
		
		if((num & a) == 0) {
			return false;
		}else {
			return true;
		}
	}

}
