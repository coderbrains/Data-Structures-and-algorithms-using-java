package compareblesAndComparators;

public class Introduction_To_Compare_Comparator {
	
	/*
	 * _________________________COMPARABLE____________________________
	 * 
	 * It is an interface
	 * Must implemented by the class which is to be sorted and which 
	 * is non primitive like as we made our own class then the natural
	 * ordering of the object is not defined in the java Object class.
	 * So it is the time to define our own method to sort the given 
	 * object by implementing the comparable into it.
	 * 
	 * package compareblesAndComparators;

public class Student implements Comparable<Student>{
	
	int marks;
	String name ;
	


	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		
		int a =  this.marks - o.marks;
		if(!(a==0))return a;
		return this.name.compareTo(o.name);
	}
	
	

}

	 * 	Here the natural ordering is defined by us......
	 * 
	 * 
	 * 
	 * _________________COMPARATORS_____________________________
	 * 
	 * 
	 * 
	 * 1st method to use comparator in our class...........
	 * 
	 * 
	 * 
	 * package compareblesAndComparators;

		import java.util.*;
		
		public class MainClass {
		
			public static void main(String[] args) {
				
				
				List<Student> students = new LinkedList<>();
		
				students.add(new Student(34, "Awanish"));
		
				students.add(new Student(34, "Aayush"));
				students.add(new Student(67, "Manish"));
				students.add(new Student(78, "Aayush"));
				students.add(new Student(99, "Abhimnyu"));
				
				Collections.sort(students, new sortBynameandthenMarks());
				
				students.forEach(System.out::println);
			}
		
		}
		
		class sortBynameandthenMarks implements Comparator<Student>{
		
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.name.equals(o2.name))return o1.marks - o2.marks;
				return o1.name.compareTo(o2.name);
			}
			
			
			
			
			
		}





	 * 2nd method to use the compartor in our class.........
	 * 
	 * package compareblesAndComparators;

			import java.util.*;
			
			public class MainClass {
			
				public static void main(String[] args) {
					
					
					List<Student> students = new LinkedList<>();
			
					students.add(new Student(34, "Awanish"));
			
					students.add(new Student(34, "Aayush"));
					students.add(new Student(67, "Manish"));
					students.add(new Student(78, "Aayush"));
					students.add(new Student(99, "Abhimnyu"));
					
					Collections.sort(students, new Comparator<Student>(){
						
						@Override
						public int compare(Student o1, Student o2) {
							if(o1.name.equals(o2.name))return o1.marks - o2.marks;
							return o1.name.compareTo(o2.name);
						}
						
					});
					
					students.forEach(System.out::println);
				}
			
			}




	 * _______3rd method________________________
	 * 
	 * 
	 * 	
		//This is the third method
		//we will first make a class of which will implements the 
		//comparator and then we will pass that class through the 
		//Collections.sort okay :))
		
//		Collections.sort(students, new SortBynameAndThenMarks());
		
		//This is the fourth method
		
		//Collections.sort(students, (o1 , o2) -> o1.name.compareTo(o2.name));
		
		
		//This is the fifth method
		
		Collections.sort(students, Comparator.comparing(Student1::getName).thenComparing(Student1::getMarks));
		
		
	 * 
	 * 
	 * 
	 * 
	 */

}
