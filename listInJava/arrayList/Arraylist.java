package listInJava.arrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		
		
		List<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(121);
		arrayList.add(23);
		
		Collections.sort(arrayList);
		
		arrayList.forEach(System.out::println);  // :: --> called as lambda function
		
		

	}

}
