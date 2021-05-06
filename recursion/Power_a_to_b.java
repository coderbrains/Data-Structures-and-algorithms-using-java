package recursion;

public class Power_a_to_b {

	public static void main(String[] args) {
		

		System.out.println(power(0, 1));
	}
	
	static int power(int a, int b) {
		if(b==0)return 1;
		if(b==1)return a;
		if(a==0)return 0;
		return a * power(a, b-1);
	}

}
