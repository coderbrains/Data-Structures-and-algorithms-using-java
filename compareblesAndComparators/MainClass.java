package compareblesAndComparators;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		
		List<Student> students = new LinkedList<>();

		students.add(new Student(34, "Awanish"));

		students.add(new Student(34, "Aayush"));
		students.add(new Student(67, "Manish"));
		students.add(new Student(78, "Aayush"));
		students.add(new Student(99, "Abhimnyu"));
		
//		Collections.sort(students, new sortBynameandthenMarks());
		
//		Collections.sort(students, new Comparator<Student>(){
//			
//			@Override
//			public int compare(Student o1, Student o2) {
//				if(o1.name.equals(o2.name))return o1.marks - o2.marks;
//				return o1.name.compareTo(o2.name);
//			}
//			
//			
//		});
		
		//This is the first method 
				//We have made an anonymous class in it.
//				Collections.sort(students , new Comparator<Student1>() {
//					@Override
//					public int compare(Student1 o1 , Student1 o2) {
//						if(o1.name.equals(o2.name)) {
//							return o1.marks - o2.marks;
//						}else {
//							return o1.name.compareTo(o2.name);
//						}
//					}
//				});
				
				//This is the second method
				//compiler know the type of o1 and o2
				//Compiler know the name of the method you are overriding
				//compiler uses lambda function -> to clarify all these
//				Collections.sort(students ,( o1 ,  o2) -> {
//						if(o1.name.equals(o2.name)) {
//							return o1.marks - o2.marks;
//						}else {
//							return o1.name.compareTo(o2.name);
//						}
//					});
				
				
				//This is the third method
				//we will first make a class of which will implements the 
				//comparator and then we will pass that class through the 
				//Collections.sort okay :))
				
//				Collections.sort(students, new SortBynameAndThenMarks());
				
				//This is the fourth method
				
				//Collections.sort(students, (o1 , o2) -> o1.name.compareTo(o2.name));
				
				
				//This is the fifth method
				
				Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
				
				
		
		students.forEach(System.out::println);
	}

}















