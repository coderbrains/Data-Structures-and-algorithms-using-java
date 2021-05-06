package queue.priorityQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SlidingWindow {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The number of elements : ");
		int size = sc.nextInt();
		
		System.out.println("Enter The elements one by one :");
		int[] a = new int[size];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter The length of the sliding window : ");
		int k = sc.nextInt();
		
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			
			if(i < k) {
				queue.offerLast(a[i]);
			}else {
			
				arrayList.addAll(queue);
				System.out.println(max(arrayList));
				queue.pollFirst();
				queue.offerLast(a[i]);
				if((i == a.length - 1)) {
					arrayList.addAll(queue);
					Collections.sort(arrayList, Collections.reverseOrder());
					System.out.println(arrayList.get(0));
				}		
			}
			
		}
		
		

		sc.close();
		
		
		
	}
	
	public static int max(ArrayList<Integer> arrayList ) {
		
		int max = arrayList.get(0);
		for(int i = 1; i < arrayList.size(); i++) {
			if(arrayList.get(i) > max) max = arrayList.get(i); 
		}
		
		return max;
	}

}
