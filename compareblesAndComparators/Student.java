package compareblesAndComparators;

public class Student{
	
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


	public int compareTo(Student o) {
		
		int a =  this.marks - o.marks;
		if(!(a==0))return a;
		return this.name.compareTo(o.name);
	}
	
	

}
