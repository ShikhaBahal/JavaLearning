package OOpsConceptPart2;

public class BMW extends Car{ //"has-a-relationship"

	//When same method is present in parent class as well as child with same number of arguments and data-type of arguments
	//is called Method-Overriding
	public void start() {
		System.out.println("BMW start-----");
	}
	
	public void theftsafety() {
		System.out.println("BMW Theft Safety----");
	}
}
