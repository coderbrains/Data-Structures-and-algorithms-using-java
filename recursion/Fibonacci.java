package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 40	; i++) {
			System.out.println(i + "-->" + fibonacci(i));
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken = " + (end - start));

		
		start = System.currentTimeMillis();
		
		int[] a = new int[40];
		a[0] = 0;
		a[1] = 1;
		
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i-1] + a[i-2];
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + "--" + a[i]);
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("Time = " + (end - start));
		
		
	}
	
	static int fibonacci(int n) {
		
		if(n==0 || n==1)return n;
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
