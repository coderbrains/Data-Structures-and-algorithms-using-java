package recursion;

public class PathFinderInMatrix {

	public static void main(String[] args) {
	
		System.out.println(path(4, 4));

	}
	
	static int path(int m, int n) {
		if(m==1 || n==1) return 1;
		return path(m, n-1) + path(n, m-1);
	}

}
