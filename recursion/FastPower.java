package recursion;

public class FastPower {

	public static void main(String[] args) {
		
		System.out.println(fastPower(10, 3));
		

	}
	
	static int fastPower(int a, int b) {
		if(a==0)return 0;
		if(b==0)return 1;
		if(b==1)return a;
		if(b % 2 == 0)return fastPower(a, b/2) * fastPower(a, b/2);
		else return a * fastPower(a, b-1);
	}

}
