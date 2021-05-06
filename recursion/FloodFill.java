package recursion;

public class FloodFill {

	public static void main(String[] args) {
		
		int a[][] = {				
				{1, 1, 2, 2, 3, 3, 4},
				{1, 2, 2, 2, 3, 3, 4},
				{2, 2, 3, 1, 3, 4, 4},
				{1, 2, 2, 2, 3, 3, 4 }				
		};
		
		floodFill(a, 0, 6, 4, 9);
		
		printMatrix(a);

	}
	
	static void printMatrix(int[][] a) {
			
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[0].length; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
	
	static void floodFill(int[][] a, int m, int n, int prevFill, int toFill) {
		
		int rows = a.length;
		int cols = a[0].length;
		
		if(m >= rows || m < 0)return;
		if(n >= cols || n < 0)return;
		if(a[m][n] != prevFill)return;
		a[m][n] = toFill;
		floodFill(a, m, n+1, prevFill, toFill);
		floodFill(a, m, n-1, prevFill, toFill);
		floodFill(a, m+1, n, prevFill, toFill);
		floodFill(a, m-1, n, prevFill, toFill);
		
	}

}
