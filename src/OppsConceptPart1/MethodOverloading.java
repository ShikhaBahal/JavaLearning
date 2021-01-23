package OppsConceptPart1;

public class MethodOverloading {
	
	//Method Overloading : 
	//When the method name is same with different arguments/input parameter within the same class
	//or same name with same arguments but different data type of arguments within the same class 
	//You can not create method inside a method
	//Duplicate methods -- with same method and same arguments are not allowed

	public static void main(String[] args) {
		
	}
	
	//Can we overload main method also ? Answer is YES 
	
	public static void main(int s) {
		
	}
	
	public static void main(int p , int q) {
		
	}

	public void sum() {
		System.out.println("Sum Method---zero input parameter");
	}
	
	public void sum(int i) {
		System.out.println("Sum Method--One Input parameter");
		System.out.println(i);
		
	}
	
	public void sum(int a , int b) {
		System.out.println("Sum Method --Two input parameter");
		System.out.println(a+b);
	}
	
	public void sum(double j) {
		System.out.println("Sum Methode --One input parameter but diff datatype");
		System.out.println(j);
	}
	
	
	
	
}
