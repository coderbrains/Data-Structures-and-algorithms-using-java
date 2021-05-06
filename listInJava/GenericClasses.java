package listInJava;

public class GenericClasses {

	public static void main(String[] args) {
		
		Generic<String, Integer> generic;
		generic = new Generic<String, Integer>("Awanish", 12);
		
		generic.print();
		
		Generic<Integer, String> generic2;
		
		generic2 = new Generic<Integer, String>(12, "Awanishh");
		
		generic2.print();
		

	}

}

class Generic<E, F>{
	
	E name;
	F roll;
	
	public Generic(E name , F roll) {
		
		this.name = name;
		this.roll = roll;
		
	}
	
	public void print() {
		System.out.println(name + " " + roll);
	}
	
	
}
