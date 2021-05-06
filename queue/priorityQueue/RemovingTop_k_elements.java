package queue.priorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RemovingTop_k_elements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The number of elements:");
		int size = sc.nextInt();
		
		int[] a= new int[size];
		
		System.out.println("Enter The numbers :");
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter The number of elements "
				+ "you want to pop :");
		int k = sc.nextInt();

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < a.length; i++) {
			if(i < k) {
				pq.add(a[i]);
			}else {
				if(pq.peek() < a[i]) {
					pq.remove();
					pq.add(a[i]);
					
				}
			}
		}
		ArrayList<Integer> arrayList = new ArrayList<Integer>(pq);
		Collections.sort(arrayList , Collections.reverseOrder());
		arrayList.forEach(System.out::println);
		
		sc.close();
	}

}
