package OppsConceptPart1;

public class StaticAndNonStaticConcept {
	
	// Global variable : : The scope of global variable will be available across all the functions with some conditions : 
	//if it is static you can access it directly and if it is non static you have to access it with object reference

	
	String name = "Shikha"; //non static global variable
	static int age = 23; // static global variable
	public static void main(String[] args) {
		
		//how to call static methods and variables?
		//1- Direct calling:
		sum();
		//2- Calling by class name
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call non static methods and variables?
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.nonstatic();
		System.out.println(obj.name);
		
		// Can I access static methods by using object reference obj ? YES
		//obj.sum(); //One warning will be given : 
		//The static method sum() from the type StaticAndNonStaticConcept should be accessed in a static way
		
	}
	
	public static void sum() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("This is a static method");
		System.out.println(c);
	}
	
	public void nonstatic() {
		System.out.println("This is a non atatic method");
	}
}
