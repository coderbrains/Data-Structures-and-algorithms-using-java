package listInJava.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListStrings {

	public static void main(String[] args) {
		
		
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Awanish");
		arrayList.add("Manish");
		arrayList.add("Ayush");
		arrayList.add("Shyam");
		
		
		
		Collections.sort(arrayList );
		
		arrayList.forEach(System.out::println);
		
		

	}

}
