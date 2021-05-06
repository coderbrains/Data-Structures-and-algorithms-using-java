package arrayQuestions;

import java.util.Arrays;

public class AliceCandyHackrnk {

	public static void main(String[] args) {
		
		int[] b = {10, 2, 1, 3, 4, 8};
		
		int[] a = new int[b.length];
		
		Arrays.fill(a, 1);
		
		for (int i = 1; i < b.length ; i++) {
			
			if(b[i] > b[i-1]) {
				a[i] = a[i-1] + 1; 
			}
		}
		
		for (int i = b.length - 2; i >= 0; i--) {
			
			if(b[i] > b[i+1]) {
				a[i] = Math.max(a[i], a[i+1] + 1); 
			}
		}
		int sum =0;
		for (int i = 0; i < b.length; i++) {
			System.out.print(a[i] + " ");
		    sum += a[i];
		}
		
		System.out.println();
		System.out.println("Sum = " + sum);

	}

}
